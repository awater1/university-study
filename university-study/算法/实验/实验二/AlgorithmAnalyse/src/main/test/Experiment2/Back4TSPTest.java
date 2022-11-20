package Experiment2;

import org.junit.Assert;
import org.junit.Test;

public class Back4TSPTest {

	@Test
	public void testBacktrack4TSP() {
		Back4TSP back4TSP = new Back4TSP();
		int[][] b = { { -1, -1, -1, -1, -1 }, { -1, -1, 9, 19, 13 }, { -1, 21, -1, -1, 14 }, { -1, 1, 40, -1, 17 },
				{ -1, 41, 80, 10, -1 } };
		int n = 4;
		back4TSP.backtrack4TSP(b, n);
		Assert.assertTrue(back4TSP.bestc == 34);
	}

}
