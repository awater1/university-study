import java.util.Scanner;

/**
 * @author awater
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(numWays(n,k));
    }

    public static int numWays(int n, int k) {
        int mod = (int)(1e9+7);
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = k;
            }
            else if (i == 2) {
                dp[i] = k*k;
            }
            else {
                dp[i] = (k-1) * (dp[i-1] + dp[i-2]);
            }
        }
        return dp[n]%mod;
    }
}