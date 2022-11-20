import java.util.*;

import static java.lang.Math.log;

public class Main{
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int inputValue = sn.nextInt();
        System.out.println(new Main().lastRemaining(inputValue));

    }

    /**
     * @param n 数组长度
     * @param fromLeft ture 从左到右，false从右到左
     * @return
     */
    public long recursion(int n, boolean fromLeft) {
        if (n == 1) return 1;
        // TODO
        int cnt = (int)(log(n)/log(2));
        long[][] dp = new long[cnt+1][n];
        for (int k = 0; k < n; k++) {
            dp[0][k] = k+1;
        }

        for (int i = 1; i <= cnt; i++) {
            int len = n;
            n >>= 1;
            if(fromLeft){
                for (int j = 0; j < n; j++) {
                    dp[i][j] = dp[i - 1][2 * j + 1];
                }
                fromLeft = false;
            }
            else {
                if(len%2==1){
                    for (int j = 0; j < n; j++) {
                        dp[i][j] = dp[i-1][2*j+1];
                    }
                }
                if (len%2==0) {
                    for (int j = 0; j < n; j++) {
                        dp[i][j] = dp[i-1][2*j];
                    }

                }
                fromLeft = true;
            }

        }

        return dp[cnt][0];
    }

    public long lastRemaining(int n) {
        return recursion(n, true);
    }
}
