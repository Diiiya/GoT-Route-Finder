package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class DijkstraGraphClass {

	private GraphsClass graph;
	
	public DijkstraGraphClass(GraphsClass graph)
	{
		this.graph = graph;
	}
	
	public GraphsClass getGraph()
	{
		return graph;
	}
	
	public List<NodeClass> getShortestPath(NodeClass from, NodeClass to)
	{
		Map<NodeClass, Integer> nodeDistanceMapping = getNodeDistanceMapping(from);
		
		Map<NodeClass, NodeClass> previousNodeMapping = getPreviousNodeMapping();
		
		Set<NodeClass> unsettled = new HashSet<NodeClass>();
		unsettled.add(from);
		
		Set<NodeClass> settled = new HashSet<NodeClass>();
		
		while(unsettled.size() != 0)
		{
			NodeClass currentNode = getLowestUnsettledNode(unsettled, nodeDistanceMapping);
			
			int currentDistance = nodeDistanceMapping.get(currentNode);
			unsettled.remove(currentNode);
			
			for(final LinksClass l: currentNode.getLinks())
			{
				int currentNeighbourDistance = nodeDistanceMapping.get(l.getTo());
				int newNeighbourDistance = currentDistance + l.getWeight();
				
				if(!settled.contains(l.getTo()) && newNeighbourDistance < currentNeighbourDistance)
				{
					nodeDistanceMapping.put(l.getTo(), newNeighbourDistance);
					previousNodeMapping.put(l.getTo(), currentNode);
					unsettled.add(l.getTo());
				}
			}
			
			settled.add(currentNode);
		}
		
		List<NodeClass> route = new ArrayList<NodeClass>();
		
		for(NodeClass n = to; n != null; n = previousNodeMapping.get(n))
		{
			route.add(n);
		}
		
		Collections.reverse(route);
		return route;
	}
}
