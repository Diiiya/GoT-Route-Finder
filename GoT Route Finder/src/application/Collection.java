package application;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	private List<NodeClass> nodes; 
	private List<LinksClass> links; 

	public Collection()
	{
		this.nodes = new ArrayList<>();
		addAllNodes(nodes);
		
		this.links = new ArrayList<>();
		addAllLinks(links);
	}
	
	
	
	/*public void setNodes(List<NodeClass> nodes)
	{
		this.nodes = nodes;
	}
	
	public void setLinks(List<LinksClass> links)
	{
		this.links = links;
	}*/
	
	//Nodes
    NodeClass A = new NodeClass("A", 100, 200);	
	NodeClass B = new NodeClass("B", 200, 500);	
	NodeClass C = new NodeClass("c", 300, 500);	
	NodeClass D = new NodeClass("d", 1000, 800);
	
	//Links	
	LinksClass link1 = new LinksClass(A, B, 12);	
	LinksClass link2 = new LinksClass(A, C, 1);	
	LinksClass link3 = new LinksClass(B, D, 3);	
	LinksClass link4 = new LinksClass(C, D, 5);
	
	public void addAllNodes(List<NodeClass> nodes)
	{
		for(NodeClass n: nodes)
		{
			nodes.add(n);
		}
	}
	
	public void addAllLinks(List<LinksClass> links)
	{
		for(LinksClass l: links)
		{
			links.add(l);
		}
	}
	

	public List<NodeClass> getNodesList()
	{
		return nodes;
	}
	
	public List<LinksClass> getLinksList()
	{
		return links;
	}
}
