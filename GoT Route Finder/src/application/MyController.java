package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MyController {
	
	@FXML
	private ImageView imageView;	

	@FXML
	private Button button;
	
	BufferedImage bufferedImg;
	
	NodeClass A = new NodeClass("A", 100, 200);
	
	NodeClass B = new NodeClass("B", 200, 500);
	
	NodeClass C = new NodeClass("c", 300, 500);
	
	NodeClass D = new NodeClass("d", 1000, 800);
	
	public List<NodeClass> nodes = new ArrayList<>();
	
	//public List<LinksClass> links = new ArrayList<>();
		
	GraphsClass grc = new GraphsClass(nodes);
	
	/*LinksClass link1 = new LinksClass(A, B, 12);
	
	LinksClass link2 = new LinksClass(A, C, 1);
	
	LinksClass link3 = new LinksClass(B, D, 3);
	
	LinksClass link4 = new LinksClass(C, D, 5);*/
	
	
	DijkstraGraphClass dc;
	
	public void findThePath(ActionEvent event)
	{
		
		nodes.add(A);
		nodes.add(B);
		nodes.add(C);
		nodes.add(D);
		
		grc.getNodes();		
		
		/*A.addTwoWayNeighbour(link1);
		A.addTwoWayNeighbour(link2);
		B.addTwoWayNeighbour(link3);
		C.addTwoWayNeighbour(link4);*/
		
		for(LinksClass l : A.getLinks())
		{
			System.out.println(l);
		}
		
		bufferedImg = SwingFXUtils.fromFXImage(imageView.getImage(), null);
		
		dc = new DijkstraGraphClass(grc);
		
		//dc.getShortestPath(A, D);
		
		
		Graphics g = bufferedImg.getGraphics();
		
		g.setColor(Color.BLACK);
		
				
		List<NodeClass> nodeArray = new ArrayList<>();
		
		/*for(NodeClass n: dc.getShortestPath(A, D))
		{
			nodeArray.add(n);
			System.out.println(n);
		}*/
		
		
		for(int i = 0; i < nodeArray.size(); i++)
		{
			if(i + 1 != nodeArray.size()) 
			{
				NodeClass node1 = nodeArray.get(i);
				NodeClass node2 = nodeArray.get(i + 1);
				g.drawLine(node1.getX(), node1.getY(), node2.getX(), node2.getY());
			}
		}		
		
		g.dispose();
		
		Image img = SwingFXUtils.toFXImage(bufferedImg, null);
		
		imageView.setImage(img);
	}

}
