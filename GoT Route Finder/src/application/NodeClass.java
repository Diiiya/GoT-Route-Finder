package application;

import java.util.ArrayList;
import java.util.List;

public class NodeClass {

	private int x;
	private int y;
	private String id;
	private List<LinksClass> links;
	
	public NodeClass(String id, int x, int y)
	{
		this.id = id;
		this.x = x;
		this.y = y;
		this.links = new ArrayList<LinksClass>();
	}
	
	public String getId()
	{
		return id;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
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
	
	public void addTwoWayNeighbour(LinksClass link)//NodeClass neighbour, int weight)
	{
		addOneWayNeighbour(link.getTo(), link.getWeight());
		link.getTo().addOneWayNeighbour(this, link.getWeight());
	}
	
	@Override
	public int hashCode()
	{
		return id.hashCode();
	}
	
	@Override
	public String toString()
	{
		return id;
	}
}
