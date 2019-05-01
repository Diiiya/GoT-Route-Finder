package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerHelper {
	
	static NodeClass node1, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11, node12, node13, node14, node15, node16, node17,
	node18, node19, node20, node21, node22, node23, node24, node25, node26, node27, node28, node29, node30;
	static List<NodeClass> gotList;
	
	public static List<NodeClass> createNodes() {
		node1 = new NodeClass("The Milkwaer", 845, 415);
		node2 = new NodeClass("Castle Black", 958, 525);
		node3 = new NodeClass("Bear Island", 640, 640);
		node4 = new NodeClass("Wolfswood", 660, 770);
		node5 = new NodeClass("Winterfell", 820, 840);
		node6 = new NodeClass("The Dreadfort", 1030, 810);
		node7 = new NodeClass("Barrowtown", 670, 1030);
		node8 = new NodeClass("White Harbor", 930, 1050);
		node9 = new NodeClass("Moat Cailin", 820, 1100);
		node10 = new NodeClass("The Twins", 790, 1310);
		node11 = new NodeClass("Pyke", 520, 1415);
		node12 = new NodeClass("The Crag", 555, 1505);
		node13 = new NodeClass("Riverrun", 750, 1480);
		node14 = new NodeClass("Harrenhal", 910, 1540);
		node15 = new NodeClass("Gulltown", 1210, 1420);
		node16 = new NodeClass("Faircastle", 500, 1550);
		node17 = new NodeClass("Casterly Rock", 430, 1640);
		node18 = new NodeClass("Lannisport", 520, 1650);
		node19 = new NodeClass("King's Landing", 980, 1710);
		node20 = new NodeClass("Dragonstone", 1170, 1600);
		node21 = new NodeClass("Storm's end", 1130, 1870);
		node22 = new NodeClass("Highgarden", 630, 1940);
		node23 = new NodeClass("Oldtown", 515, 2080);
		node24 = new NodeClass("Sunspear", 1200, 2190);
		node25 = new NodeClass("The Eyrie", 1040, 1390);
		node26 = new NodeClass("Boneway 1", 920, 2008);
		node27 = new NodeClass("Boneway 2", 894, 2098);
		node28 = new NodeClass("Tarth", 1206, 1856);
		node29 = new NodeClass("Ocean Road", 502, 1841);
		node30 = new NodeClass("The Princess Pass", 780, 2050);
		
		gotList = new ArrayList<NodeClass>();
		gotList.addAll(Arrays.asList(node1, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11, node12, node13, node14, node15, node16,
				node17, node18, node19, node20, node21, node22, node23, node24, node25, node26, node27, node28, node29, node30));
		
		return gotList;
	}
	
	public static void linkNodes() {
		node1.addTwoWayNeighbour(node2, 5, 15);
		node2.addTwoWayNeighbour(node5, 15, 10);
		node2.addTwoWayNeighbour(node6, 13, 5);
		node5.addTwoWayNeighbour(node4, 8, 10);
		node4.addTwoWayNeighbour(node3, 5, 15);
		node5.addTwoWayNeighbour(node6, 8, 5);
		node5.addTwoWayNeighbour(node7, 8, 5);
		node5.addTwoWayNeighbour(node9, 13, 5);
		node5.addTwoWayNeighbour(node8, 10, 5);
		node6.addTwoWayNeighbour(node8, 13, 5);
		node7.addOneWayNeighbour(node9, 8, 5);
		node8.addTwoWayNeighbour(node9, 5, 5);
		node9.addOneWayNeighbour(node10, 13, 5);
		node10.addTwoWayNeighbour(node14, 15, 5);
		node10.addTwoWayNeighbour(node25, 13, 10);
		node12.addTwoWayNeighbour(node11, 5, 10);
		node12.addTwoWayNeighbour(node18, 8, 5);
		node14.addTwoWayNeighbour(node13, 11, 5);
		node14.addTwoWayNeighbour(node15, 8, 15);
		node14.addTwoWayNeighbour(node20, 12, 10);
		node14.addTwoWayNeighbour(node19, 12, 5);
		node13.addTwoWayNeighbour(node12, 16, 5);
		node13.addTwoWayNeighbour(node17, 26, 5);
		node16.addTwoWayNeighbour(node17, 7, 10);
		node18.addTwoWayNeighbour(node19, 30, 5);
		node18.addTwoWayNeighbour(node17, 4, 0);
		node18.addTwoWayNeighbour(node22, 27, 5);
		node18.addTwoWayNeighbour(node29, 15, 0);
		node19.addTwoWayNeighbour(node20, 10, 10);
		node19.addTwoWayNeighbour(node22, 45, 5);
		node19.addTwoWayNeighbour(node21, 17, 8);
		node21.addTwoWayNeighbour(node22, 28, 8);
		node21.addTwoWayNeighbour(node26, 15, 15);
		node21.addTwoWayNeighbour(node28, 5, 5);
		node26.addTwoWayNeighbour(node27, 10, 10);
		node27.addTwoWayNeighbour(node24, 20, 8);
		node22.addTwoWayNeighbour(node23, 11, 0);
		node22.addTwoWayNeighbour(node26, 12, 8);
		node22.addTwoWayNeighbour(node29, 15, 0);
		node27.addTwoWayNeighbour(node30, 9, 10);
		node22.addTwoWayNeighbour(node30, 10, 10);
		node23.addTwoWayNeighbour(node30, 22, 10);
		node25.addTwoWayNeighbour(node15, 9, 5);
	}

}
