package main.test.Experiment1;

import org.junit.Assert;
import org.junit.Test;

import main.java.Experiment1.GamePassProbability;


/**
 * @author awater
 */
public class GamePassProbabilityTest {
	
	@Test
	public void testCalculateProbability(){
		GamePassProbability gamePassProbability = new GamePassProbability();
    	int[] p1 = {50, 50, 50, 50};
    	int[] p2 = {80, 80, 90, 90, 99};
    	int[] p3 = {};
        double result1 = gamePassProbability.calculatePassProbability(p1, 4);
        double result2 = gamePassProbability.calculatePassProbability(p2, 5);
        double result3 = gamePassProbability.calculatePassProbability(p3, 0);
        Assert.assertEquals(0.31250, result1, 0.0);
        Assert.assertEquals(0.88906, result2, 0.0);
        Assert.assertEquals(1, result3, 0.0);
    }

}
