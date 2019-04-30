package application;

public class LinksClass {

	private NodeClass from;
	private NodeClass to;
	private int weight;
	private int difficulty;
	
	public LinksClass(NodeClass from, NodeClass to, int weight, int difficulty)
	{
		this.from = from;
		this.to = to;
		this.weight = weight;
		this.difficulty = difficulty;
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
	
	public int getDifficulty()
	{
		return difficulty;
	}
	
	@Override
	public String toString()
	{
		return "from " + from.getName() + " to " + to.getName() + ", weight " + weight + ", difficulty " + difficulty;
	}
}
