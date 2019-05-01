package application;

public class LinksClass {

	private NodeClass from;
	private NodeClass to;
	private int weight;
	private int difficulty;
	private int safety;
	
	public LinksClass(NodeClass from, NodeClass to, int weight, int difficulty, int safety)
	{
		this.from = from;
		this.to = to;
		this.weight = weight;
		this.difficulty = difficulty;
		this.safety = safety;
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
	
	public int getSafety()
	{
		return safety;
	}
	
	@Override
	public String toString()
	{
		return "from " + from.getName() + " to " + to.getName() + ", weight " + weight + ", difficulty " + difficulty + ", safety " + safety;
	}
}
