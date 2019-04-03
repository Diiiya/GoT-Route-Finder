package application;

import java.util.ArrayList;
import java.util.List;

public class NodeClass {

	private String id;
	private List<LinksClass> links;
	
	public NodeClass(String id)
	{
		this.id = id;
		this.links = new ArrayList<LinksClass>();
	}
	
	public String getId()
	{
		return id;
	}
	
	public List<LinksClass> getLinks()
	{
		return links;
	}
	
	public List<NodeClass> getNextNodes()
	{
		List<NodeClass> nodes = new ArrayList<NodeClass>(getLinks().size());
		
		for(LinksClass l: getLinks())
		{
			nodes.add(l.getTo());
		}
		return nodes;
	}
	
	public void addOneWayNeighbour(NodeClass neighbour, int weight)
	{
		this.links.add(new LinksClass(this, neighbour, weight));
	}
	
	public void addTwoWayNeighbour(NodeClass neighbour, int weight)
	{
		addOneWayNeighbour(neighbour, weight);
		neighbour.addOneWayNeighbour(this, weight);
	}
	
	@Override
	public int hashCode()
	{
		return id.hashCode();
	}
	
	@Override
	public String toString()
	{
		return id + " " + links.size();
	}
}
