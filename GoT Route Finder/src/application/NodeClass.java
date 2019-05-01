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
	
	public void addOneWayNeighbour(NodeClass neighbour, int weight, int difficulty, int safety)
	{
		this.links.add(new LinksClass(this, neighbour, weight, difficulty, safety));
	}
	
	public void addTwoWayNeighbour(NodeClass neighbour, int weight, int difficulty, int safety)
	{
		addOneWayNeighbour(neighbour, weight, difficulty, safety);
		neighbour.addOneWayNeighbour(this, weight, difficulty, safety);
	}
	
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
