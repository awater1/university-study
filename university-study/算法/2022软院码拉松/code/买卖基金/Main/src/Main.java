import java.util.Scanner;

class Main {
    private static int k = 2;
    public static int maxProfit(int[] prices) {
        int[] dp = new int[2*k+1];
        for(int i=1;i<=k;i++){
            dp[2*i-1] -= prices[0];
        }

        for (int price : prices) {
            for (int i = 1; i <=  2*k; i++) {
                dp[i] =  Math.max(dp[i],(int)(dp[i-1]+price*Math.pow(-1,i)));
            }

        }
        return dp[2*k];


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        System.out.println(maxProfit(prices));
    }
}