package application;

public class LinksClass {

	private NodeClass from;
	private NodeClass to;
	private int weight;
	
	public LinksClass(NodeClass from, NodeClass to, int weight)
	{
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	public NodeClass getFrom()
	{
		return from;
	}
	
	public NodeClass getTo()
	{
		return to;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	@Override
	public String toString()
	{
		return "from " + from.getId() + " to " + to.getId() + ", weight " + weight;
	}
}
