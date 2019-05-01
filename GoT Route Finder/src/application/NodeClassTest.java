package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeClassTest {

	@Test
	void testConstructor() {
		
		String name = "Point X";
		int x = 200;
		int y = 300;

		NodeClass node = new NodeClass(name, x, y);

		assertEquals(name, node.getName());
		assertEquals(x, node.getX());
		assertEquals(y, node.getY());

		assertEquals(0, node.getLinks().size());
	}
	
	@Test
	void testAddTwoWayNeighbor() {
		
		String node1Name = "Point X";
		String node2Name = "Point Y";
		String node3Name = "Point Z";
		
		int x1 = 100;
		int y1 = 100;
		int x2 = 200;
		int y2 = 200;
		int x3 = 200;
		int y3 = 200;
		
		int nodeWeight = 404;
		int nodeDifficulty = 3;
		int nodeSafety = 666;


		NodeClass node1 = new NodeClass(node1Name, x1, y1);
		NodeClass node2 = new NodeClass(node2Name, x2, y2);
		NodeClass node3 = new NodeClass(node3Name, x3, y3);

		node1.addTwoWayNeighbour(node2, nodeWeight, nodeDifficulty, nodeSafety);
		node1.addTwoWayNeighbour(node3, nodeWeight, nodeDifficulty, nodeSafety);
		assertEquals(2, node1.getLinks().size());
		assertEquals(2, node1.getNextNodes().size());
		assertEquals(1, node2.getLinks().size());
		assertEquals(1, node2.getNextNodes().size());
	}

}
