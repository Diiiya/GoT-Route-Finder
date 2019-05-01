package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


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
	
	public List<NodeClass> getPath(NodeClass from, NodeClass to, String kindOfPath)
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
				int newNeighbourDistance = 0;
				if(kindOfPath == "shortest") {
					
					newNeighbourDistance = currentDistance + l.getWeight();					
				}
				if(kindOfPath == "easiest") {
					
					newNeighbourDistance = currentDistance + l.getDifficulty();					
				}
				if(kindOfPath == "safest") {
					
					newNeighbourDistance = currentDistance + l.getSafety();					
				}
				
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
	
	private Map<NodeClass, NodeClass> getPreviousNodeMapping() {

		Map<NodeClass, NodeClass> mappings = new HashMap<>();

		for(NodeClass n : getGraph().getNodes()) {

			mappings.put(n, null);

		}

		return mappings;

	}
	
	private NodeClass getLowestUnsettledNode(Set<NodeClass> unsettled, Map<NodeClass, Integer> distanceMapping) {

		Iterator<NodeClass> iter = unsettled.iterator();

		if (!iter.hasNext()) {

			return null;

		}

		NodeClass selected = iter.next();

		while (iter.hasNext()) {

			NodeClass n = iter.next();

			if (distanceMapping.get(n) < distanceMapping.get(selected)) {

				selected = n;

			}

		}

		return selected;

	}
	
	private Map<NodeClass, Integer> getNodeDistanceMapping(NodeClass from) {

		Map<NodeClass, Integer> mappings = new HashMap<NodeClass, Integer>();

		for(NodeClass n : getGraph().getNodes()) {

			mappings.put(n, Integer.MAX_VALUE);

		}

		mappings.put(from, 0);

		return mappings;

	}
}
