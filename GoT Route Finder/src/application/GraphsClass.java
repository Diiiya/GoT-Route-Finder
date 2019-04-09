package application;

import java.util.List;

public class GraphsClass {

	private List<NodeClass> nodes;
	
	public GraphsClass(List<NodeClass> nodes)
	{
		this.nodes = nodes;
	}
	
	public List<NodeClass> getNodes()
	{
		return nodes;
	}
}