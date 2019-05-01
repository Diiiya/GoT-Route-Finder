package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerHelper {
	
	static NodeClass node1, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11, node12, node13, node14, node15, node16, node17,
	node18, node19, node20, node21, node22, node23, node24, node25, node26, node27, node28, node29, node30, node31, node32, node33, node34, node35, node36,
	node37, node38, node39, node40, node41, node42, node43, node44, node45, node46, node47, node48, node49, node50, node51, node52, node53, node54, node55;
	
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
		
        node31 = new NodeClass("Braavos", 1450, 1261);
        node32 = new NodeClass("Lorath", 1650, 1312);
        node33 = new NodeClass("Norvos", 1722, 1539);
        node34 = new NodeClass("Pentos", 1460, 1692);
        node35 = new NodeClass("Ghoyan Drohe", 1602, 1660);
        node36 = new NodeClass("Qohor", 1969, 1692);
        node37 = new NodeClass("Ny Sar", 1747, 1742);
        node38 = new NodeClass("Ar Noy", 1873, 1775);
        node39 = new NodeClass("The Sorrows", 1795, 1939);
        node40 = new NodeClass("Myr", 1551, 1958);
        node41 = new NodeClass("Tyrosh", 1349, 1992);
        node42 = new NodeClass("Selhorys", 1827, 2066);
        node43 = new NodeClass("Valysar", 1815, 2127);
        node44 = new NodeClass("Sar Mell", 1859, 2164);
        node45 = new NodeClass("Volon Therys", 1845, 2185);
        node46 = new NodeClass("Volantis", 1913, 2210);
        node47 = new NodeClass("Lys", 1473, 2201);
        node48 = new NodeClass("Vaes Khadokh (Essaria)", 2186, 1682);
        node49 = new NodeClass("Saath", 2242, 1374);
        node50 = new NodeClass("Morosh", 2324, 1294);
        node51 = new NodeClass("Vaes Graddakh (Sarys)", 2369, 1361);
        node52 = new NodeClass("Vaes Khewo (Sarnath)", 2461, 1730);
        node53 = new NodeClass("Vojjor Samui", 2618, 1693);
        node54 = new NodeClass("Yalli Qamayi (Sathar)", 2742, 1732);
        node55 = new NodeClass("Vaes Leqse (Gornath)", 2723, 1644);
		
		gotList = new ArrayList<NodeClass>();
		gotList.addAll(Arrays.asList(node1, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11, node12, node13, node14, node15, node16,
				node17, node18, node19, node20, node21, node22, node23, node24, node25, node26, node27, node28, node29, node30, node31, node32, node33, node34, node35, node36,
				node37, node38, node39, node40, node41, node42, node43, node44, node45, node46, node47, node48, node49, node50, node51, node52, node53, node54, node55));
		
		return gotList;
	}
	
	public static void linkNodes() {
		node1.addTwoWayNeighbour(node2, 5, 15, 3);
		node2.addTwoWayNeighbour(node5, 15, 10, 3);
		node2.addTwoWayNeighbour(node6, 13, 5, 1);
		node5.addTwoWayNeighbour(node4, 8, 10, 2);
		node4.addTwoWayNeighbour(node3, 5, 15, 2);
		node5.addTwoWayNeighbour(node6, 8, 5, 1);
		node5.addTwoWayNeighbour(node7, 8, 5, 1);
		node5.addTwoWayNeighbour(node9, 13, 5, 1);
		node5.addTwoWayNeighbour(node8, 10, 5, 1);
		node6.addTwoWayNeighbour(node8, 13, 5, 1);
		node7.addOneWayNeighbour(node9, 8, 5, 1);
		node8.addTwoWayNeighbour(node9, 5, 5, 1);
		node9.addOneWayNeighbour(node10, 13, 5, 2);
		node10.addTwoWayNeighbour(node14, 15, 5, 2);
		node10.addTwoWayNeighbour(node25, 13, 10, 3);
		node12.addTwoWayNeighbour(node11, 5, 10, 2);
		node12.addTwoWayNeighbour(node18, 8, 5, 3);
		node14.addTwoWayNeighbour(node13, 11, 5, 1);
		node14.addTwoWayNeighbour(node15, 8, 15, 3);
		node14.addTwoWayNeighbour(node20, 12, 10, 2);
		node14.addTwoWayNeighbour(node19, 12, 5, 1);
		node13.addTwoWayNeighbour(node12, 16, 5, 2);
		node13.addTwoWayNeighbour(node17, 26, 5, 3);
		node16.addTwoWayNeighbour(node17, 7, 10, 2);
		node18.addTwoWayNeighbour(node19, 30, 5, 3);
		node18.addTwoWayNeighbour(node17, 4, 0, 1);
		node18.addTwoWayNeighbour(node22, 27, 5, 1);
		node18.addTwoWayNeighbour(node29, 15, 0, 1);
		node19.addTwoWayNeighbour(node20, 10, 10, 3);
		node19.addTwoWayNeighbour(node22, 45, 5, 1);
		node19.addTwoWayNeighbour(node21, 17, 8, 2);
		node21.addTwoWayNeighbour(node22, 28, 8, 2);
		node21.addTwoWayNeighbour(node26, 15, 15, 3);
		node21.addTwoWayNeighbour(node28, 5, 5, 2);
		node26.addTwoWayNeighbour(node27, 10, 10, 2);
		node27.addTwoWayNeighbour(node24, 20, 8, 3);
		node22.addTwoWayNeighbour(node23, 11, 0, 1);
		node22.addTwoWayNeighbour(node26, 12, 8, 3);
		node22.addTwoWayNeighbour(node29, 15, 0, 1);
		node27.addTwoWayNeighbour(node30, 9, 10, 2);
		node22.addTwoWayNeighbour(node30, 10, 10, 3);
		node23.addTwoWayNeighbour(node30, 22, 10, 3);
		node25.addTwoWayNeighbour(node15, 9, 5, 3);
		
		node24.addTwoWayNeighbour(node41, 20, 20, 3);
		node41.addTwoWayNeighbour(node40, 10, 8, 2);
		node41.addTwoWayNeighbour(node47, 12, 14, 2);
		node40.addTwoWayNeighbour(node47, 12, 10, 2);
		node40.addTwoWayNeighbour(node39, 10, 10, 1);
		node39.addTwoWayNeighbour(node34, 15, 5, 1);
		node39.addTwoWayNeighbour(node37, 8, 5, 1);
		node39.addTwoWayNeighbour(node38, 7, 4, 1);
		node34.addTwoWayNeighbour(node35, 3, 3, 1);
		node35.addTwoWayNeighbour(node33, 20, 20, 3);
		node35.addTwoWayNeighbour(node37, 10, 10, 1);
		node33.addTwoWayNeighbour(node32, 18, 30, 3);
		node32.addTwoWayNeighbour(node31, 15, 20, 3);
		node33.addTwoWayNeighbour(node36, 18, 25, 3);
		node36.addTwoWayNeighbour(node38, 10, 5, 1);
		node36.addTwoWayNeighbour(node48, 12, 10, 2);
		node48.addTwoWayNeighbour(node49, 17, 10, 1);
		node49.addTwoWayNeighbour(node50, 6, 0, 1);
		node50.addTwoWayNeighbour(node51, 6, 5, 1);
		node48.addTwoWayNeighbour(node52, 10, 10, 1);
		node52.addTwoWayNeighbour(node53, 8, 5, 1);
		node53.addTwoWayNeighbour(node54, 6, 5, 1);
		node54.addTwoWayNeighbour(node55, 7, 10, 2);
		node39.addTwoWayNeighbour(node42, 6, 5, 1);
		node42.addTwoWayNeighbour(node43, 3, 1, 1);
		node42.addTwoWayNeighbour(node44, 4, 5, 1);
		node43.addTwoWayNeighbour(node45, 5, 5, 1);
		node45.addTwoWayNeighbour(node44, 7, 8, 2);
		node44.addTwoWayNeighbour(node46, 5, 5, 1);		
	}
}
