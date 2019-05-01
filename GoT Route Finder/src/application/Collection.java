package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
	
	static NodeClass node26, node27, node28, node29, node30, node31, node32, node33, node34, node35,
		node36, node37, node38, node39, node40, node41, node42, node43, node44, node45, node46, node47, node48, node49, node50;
	
	private static List<NodeClass> nodes; 
	//private List<LinksClass> links; 

	/*public Collection()
	{
		this.nodes = new ArrayList<>();
		addAllNodes(nodes);
		
		this.links = new ArrayList<>();
		addAllLinks(links);
	}*/
	
	
	
	/*public void setNodes(List<NodeClass> nodes)
	{
		this.nodes = nodes;
	}
	
	public void setLinks(List<LinksClass> links)
	{
		this.links = links;
	}*/
	
	//Nodes
   /* NodeClass A; //= new NodeClass("A", 100, 200);	
	NodeClass B; //= new NodeClass("B", 200, 500);	
	NodeClass C; //= new NodeClass("c", 300, 500);	
	NodeClass D;// = new NodeClass("d", 1000, 800);
	
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
	}*/
	
	public static List<NodeClass> createNodes()
	{
		node26 = new NodeClass("Braavos", 1450, 1261);
		node27 = new NodeClass("Lorath", 1650, 1312);
		node28 = new NodeClass("Norvos", 1722, 1539);
		node29 = new NodeClass("Pentos", 1460, 1692);
		node30 = new NodeClass("Ghoyan Drohe", 1602, 1660);
		node31 = new NodeClass("Qohor", 1969, 1692);
		node32 = new NodeClass("Ny Sar", 1747, 1742);
		node33 = new NodeClass("Ar Noy", 1873, 1775);
		node34 = new NodeClass("The Sorrows", 1795, 1939);
		node35 = new NodeClass("Myr", 1551, 1958);
		node36 = new NodeClass("Tyrosh", 1349, 1992);
		node37 = new NodeClass("Selhorys", 1827, 2066);
		node38 = new NodeClass("Valysar", 1815, 2127);
		node39 = new NodeClass("Sar Mell", 1859, 2164);
		node40 = new NodeClass("Volon Therys", 1845, 2185);
		node41 = new NodeClass("Volantis", 1913, 2210);
		node42 = new NodeClass("Lys", 1473, 2201);
		node43 = new NodeClass("Vaes Khadokh (Essaria)", 2186, 1682);
		node44 = new NodeClass("Saath", 2242, 1374);
		node45 = new NodeClass("Morosh", 2324, 1294);
		node46 = new NodeClass("Vaes Graddakh (Sarys)", 2369, 1361);
		node47 = new NodeClass("Vaes Khewo (Sarnath)", 2461, 1730);
		node48 = new NodeClass("Vojjor Samui", 2618, 1693);
		node49 = new NodeClass("Yalli Qamayi (Sathar)", 2742, 1732);
		node50 = new NodeClass("Vaes Leqse (Gornath)", 2723, 1644);
		
		nodes = new ArrayList<NodeClass>();
		nodes.addAll(Arrays.asList(node26, node27, node28, node29, node30, node31, node32, node33, node34, node35,
				node36, node37, node38, node39, node40, node41, node42, node43, node44, node45, node46, node47, node48, node49, node50));
		
		return nodes;
	}
	
	public static void linkNodes()
	{
		node26.addTwoWayNeighbour(node29, 30);
		node29.addTwoWayNeighbour(node30, 5);
		node30.addTwoWayNeighbour(node28, 6);
		node28.addTwoWayNeighbour(node27, 15);
		node28.addTwoWayNeighbour(node30, 20);
		node28.addTwoWayNeighbour(node31, 13);
		node30.addTwoWayNeighbour(node29, 5);
		node31.addTwoWayNeighbour(node33, 5);
		node31.addTwoWayNeighbour(node43, 20);
		node32.addTwoWayNeighbour(node34, 7);
		node33.addTwoWayNeighbour(node32, 5);
		node34.addTwoWayNeighbour(node35, 6);
		node34.addTwoWayNeighbour(node37, 6);
		node35.addTwoWayNeighbour(node36, 10);
		node37.addTwoWayNeighbour(node38, 3);
		node38.addTwoWayNeighbour(node40, 3);
		node39.addTwoWayNeighbour(node41, 4);
		node40.addTwoWayNeighbour(node39, 2);
		node43.addTwoWayNeighbour(node44, 30);
		node43.addTwoWayNeighbour(node47, 20);
		node44.addTwoWayNeighbour(node45, 8);
		node45.addTwoWayNeighbour(node46, 5);
		node47.addTwoWayNeighbour(node48, 7);
		node48.addTwoWayNeighbour(node49, 6);
		node49.addTwoWayNeighbour(node50, 8);
	}
}
