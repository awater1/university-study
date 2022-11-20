import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class test1 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int inputValue = sn.nextInt();
        System.out.println(new test1().lastRemaining(inputValue));

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
        int[] dp = new int[cnt+1];
       dp[0] = 1;

        for (int i = 1; i <= cnt; i++) {
            int len = n;
            n >>= 1;
            double v = dp[i - 1] + pow(2, i - 1);
            if(fromLeft ){
                dp[i] = (int) v;
                fromLeft = false;
            }
            else {
                if ((len&1)==1){
                    dp[i] = (int) v;
                }
                if((len&1)==0){
                    dp[i] = dp[i-1];
                }
                fromLeft = true;
            }

        }

        return dp[cnt];
    }

    public long lastRemaining(int n) {
        return recursion(n, true);
    }
}
