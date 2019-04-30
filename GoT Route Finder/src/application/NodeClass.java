package application;

import java.util.ArrayList;
import java.util.List;

public class NodeClass {

	private int x;
	private int y;
	private String name;
	private List<LinksClass> links;
	
	public NodeClass(String name, int x, int y)
	{
		this.x = x;
		this.y = y;
		this.name = name;
		this.links = new ArrayList<LinksClass>();
	}
	
	public String getName()
	{
		return name;
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
	
	public void addOneWayNeighbour(NodeClass neighbour, int weight, int difficulty)
	{
		this.links.add(new LinksClass(this, neighbour, weight, difficulty));
	}
	
	public void addTwoWayNeighbour(NodeClass neighbour, int weight, int difficulty)
	{
		addOneWayNeighbour(neighbour, weight, difficulty);
		neighbour.addOneWayNeighbour(this, weight, difficulty);
	}
	
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}
	
	@Override
	public String toString()
	{
		//return name + " " + links.size();
		return name;
	}
}
