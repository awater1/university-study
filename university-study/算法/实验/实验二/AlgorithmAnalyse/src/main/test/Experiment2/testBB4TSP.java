package Experiment2;

import org.junit.Assert;
import org.junit.Test;

public class testBB4TSP {

	@Test
	public void testbb4TSP() {
		BB4TSP bb4TSP = new BB4TSP();
		int[][] b = { { -1, -1, -1, -1, -1 }, { -1, -1, 9, 19, 13 }, { -1, 21, -1, -1, 14 }, { -1, 1, 40, -1, 17 },
				{ -1, 41, 80, 10, -1 } };
		int n = 4;
		bb4TSP.bb4TSP(b, n);
		Assert.assertTrue(bb4TSP.getMinCost() == 34);
	}
}
