package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DijkstraGraphClassTest {

	private GraphsClass graph;
	private List<NodeClass> nodesList;

	@BeforeEach
	void beforeEach() {

		this.nodesList = new ArrayList<NodeClass>();

		for(int i = 0; i < 5; i++) {
			nodesList.add(new NodeClass(Integer.toString(i), 100, 100));
		}

		nodesList.get(0).addTwoWayNeighbour(nodesList.get(1), 1, 1, 2);
		nodesList.get(0).addTwoWayNeighbour(nodesList.get(2), 1, 3, 3);
		nodesList.get(0).addTwoWayNeighbour(nodesList.get(3), 2, 3, 3);

		nodesList.get(1).addTwoWayNeighbour(nodesList.get(2), 2, 1, 1);
		nodesList.get(1).addTwoWayNeighbour(nodesList.get(3), 3, 3, 3);

		nodesList.get(2).addTwoWayNeighbour(nodesList.get(4), 2, 1, 1);

		nodesList.get(3).addTwoWayNeighbour(nodesList.get(4), 7, 3, 3);

		this.graph = new GraphsClass(this.nodesList);

	}

	@Test
	void testShortestPath() {

		DijkstraGraphClass dGraph = new DijkstraGraphClass(this.graph);
		List<NodeClass> path = dGraph.getPath(nodesList.get(0), nodesList.get(4), "shortest");
		assertEquals(3, path.size());

	}
	
	@Test
	void testEasiestPath() {

		DijkstraGraphClass dGraph = new DijkstraGraphClass(this.graph);
		List<NodeClass> path = dGraph.getPath(nodesList.get(0), nodesList.get(4), "easiest");
		assertEquals(4, path.size());

	}

	@Test
	void testSafestPath()
	{
		DijkstraGraphClass dGraph = new DijkstraGraphClass(this.graph);
		List<NodeClass> path = dGraph.getPath(nodesList.get(0), nodesList.get(4), "safest");
		assertEquals(3, path.size());
	}
}
