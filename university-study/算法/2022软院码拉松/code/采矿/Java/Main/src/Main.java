import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] c = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        System.out.println(new Main().PO151(c,v,n));
    }

    public int PO151(int[] cost, int[] value, int n)
    {
        int size = cost.length;
        int[] dp = new int[n+1];

        for (int i = 0; i < size; i++) {
            for (int j = n; j >= cost[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-cost[i]]+value[i]);
            }

        }
        return dp[n];
    }
}