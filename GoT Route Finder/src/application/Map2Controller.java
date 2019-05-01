package application;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Map2Controller {
	
	@FXML
	private ChoiceBox<NodeClass> startPointCB;
	
	@FXML
	private ChoiceBox<NodeClass> endPointCB;
	
	@FXML
	private ChoiceBox<NodeClass> passByCB;
	
	@FXML
	private Button findRouteButton;
	
	@FXML
	private Button findEasiestRouteButton;

	@FXML
	private Button findSafestRouteButton;
	
	@FXML
	private Button clearButton;
	
	@FXML
	private ImageView imageView;
	
	BufferedImage bufferedImage;
	Image image;
	
	private GraphsClass gotGraph;
	private List<NodeClass> gotList;
	private ControllerHelper controllerHelper;
	
	HashMap<MenuItem, NodeClass> startPoints;
	HashMap<MenuItem, NodeClass> endPoints;
 
	NodeClass startNode;
	NodeClass endNode;
	NodeClass middleNode;
	
	Color color;
	
	//@FXML
	public void initialize() {
		image = imageView.getImage();
		bufferedImage = SwingFXUtils.fromFXImage(imageView.getImage(), null);
		
		gotList = new ArrayList<NodeClass>();
		gotList = ControllerHelper.createNodes();
		ControllerHelper.linkNodes();
		gotGraph = new GraphsClass(gotList);

		// Adding items to the start point check box
		for (int i=0; i< gotList.size(); i++) {
			startPointCB.getItems().add(gotList.get(i));
		}
		startPointCB.setValue(gotList.get(1));
				
	    // Adding items to the end point check box
		
		for (int i=0; i< gotList.size(); i++) {
			endPointCB.getItems().add(gotList.get(i));
		}
		endPointCB.setValue(gotList.get(24));
		
		// Adding items to the pass by point check box
		passByCB.getItems().add(null);
		for (int i=0; i< gotList.size(); i++) {
			passByCB.getItems().add(gotList.get(i));
		}

	}
	

	
	public void findRoute(ActionEvent e) {
		
		imageView.setImage(image);
		bufferedImage = SwingFXUtils.fromFXImage(imageView.getImage(), null);
		
		if (passByCB.getValue() == null) {
	    startNode = startPointCB.getValue();
		endNode = endPointCB.getValue();
		System.out.println("The start point is " + startNode);
		DijkstraGraphClass dGraph = new DijkstraGraphClass(gotGraph);
		List<NodeClass> path = dGraph.getPath(startNode, endNode, "shortest");
		
		color = color.BLUE;
		getPath(path, color);
		}
		else {
			startNode = startPointCB.getValue();
			middleNode = passByCB.getValue();
			endNode = endPointCB.getValue();
			System.out.println("The start point is " + startNode);
			DijkstraGraphClass dGraph = new DijkstraGraphClass(gotGraph);
			List<NodeClass> path1 = dGraph.getPath(startNode, middleNode, "shortest");
			List<NodeClass> path2 = dGraph.getPath(middleNode, endNode, "shortest");
			color = color.BLUE;
			getPath(path1, color);
			getPath(path2, color);
			
		}
		
		

	}
	
	private void getPath(List<NodeClass> path, Color color) {
        Graphics bg = bufferedImage.getGraphics();
        
		for (int i=0; i<path.size(); i++) 
		{ 
		    NodeClass obj = path.get(i);
		    int x = obj.getX();
		    int y = obj.getY();
		    System.out.println("X: " + x + " Y: " + y);
		 
		   
		    if ((i + 1) < path.size()) {
		    	NodeClass obj2 = path.get(i+1);
		    	int x2 = obj2.getX();
			    int y2 = obj2.getY();		
			    
			    Graphics2D g2D = (Graphics2D) bg;     
			    g2D.setStroke(new BasicStroke(3)); 
			    bg.setColor(color);
			    bg.drawLine(x, y, x2, y2);
		    }
		    else {
		    	int x2 = x;
			    int y2 = y;
			    Graphics2D g2D = (Graphics2D) bg;     
			    g2D.setStroke(new BasicStroke(3)); 
			    bg.setColor(color);
			    bg.drawLine(x, y, x2, y2);
		    }
		    
		}
		
		bg.dispose();
	    Image newImage = SwingFXUtils.toFXImage(bufferedImage, null);
	    imageView.setImage(newImage);
	}
	
	public void findEasiestRoute(ActionEvent e) {
		
		imageView.setImage(image);
		bufferedImage = SwingFXUtils.fromFXImage(imageView.getImage(), null);
				
		//startNode = getStartPoint(startPointCB);
		startNode = startPointCB.getValue();
		//endNode = getEndPoint(endPointCB);
		endNode = endPointCB.getValue();
		System.out.println("The start point is " + startNode);
		
		DijkstraGraphClass dGraph = new DijkstraGraphClass(gotGraph);
		List<NodeClass> path = dGraph.getPath(startNode, endNode, "easiest");
		
		color = color.GREEN;
		getPath(path, color);

	}
	
	public void findSafestRoute(ActionEvent e) {
		
		imageView.setImage(image);
		bufferedImage = SwingFXUtils.fromFXImage(imageView.getImage(), null);
		
		startNode = startPointCB.getValue();
		endNode = endPointCB.getValue();
		
		System.out.println("Safest from " + startNode + " to " + endNode);
		
		DijkstraGraphClass dGraph = new DijkstraGraphClass(gotGraph);
		List<NodeClass> path = dGraph.getPath(startNode, endNode, "safest");
		
		color = color.YELLOW;
		getPath(path, color);

	}
	
	public void clear() {
        imageView.setImage(image);
	}


}
