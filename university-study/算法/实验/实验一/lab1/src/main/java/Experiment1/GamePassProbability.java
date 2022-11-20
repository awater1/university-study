package main.java.Experiment1;

import sun.nio.cs.ext.Big5_HKSCS;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * @author awater
 */
public class  GamePassProbability {
	
	public double calculatePassProbability(int[] p, int num)
	{
        double pass = 0.0d;
		int n = (int)(0.7*num+1);
		double[][] dp = new double[n+1][num+1];
		Arrays.fill(dp[0], 1);

		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= num; j++) {
		        dp[i][j] = (1-p[j-1]*0.01)*dp[i][j-1] + 0.01*p[j-1]*dp[i-1][j-1];
		    }
		}

		pass = BigDecimal.valueOf(dp[n][num]).setScale(5, RoundingMode.HALF_UP).doubleValue();
        return (num == 0) ? 1 : pass;
	}

}
