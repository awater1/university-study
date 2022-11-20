import java.util.Scanner;

class Main {
    public static int minCost1(int[][] costs) {
        int cost = 0;
        int index = 0;
        int min;
        for (int i = 0; i < costs.length; i++) {
            if(i==0){
                min = costs[i][index];
                for (int j = 0; j < 3; j++) {
                    if (costs[i][j] < min) {
                        min = costs[i][j];
                        index = j;
                    }
                }
            }else {
                min = index>0 ? costs[i][index-1] : costs[i][index+1];
                for (int j = 0; j < 3; j++) {
                    if (costs[i][j] < min && j != index) {
                        min = costs[i][j];
                        index = j;
                    }
                }
            }
            cost += min;
        }
        return cost;
    }

    public static int minCost(int[][] costs){
        int length = costs.length;
        if (length == 0) {
            return 0;
        }

        int[][] dp = new int[length][3];
        dp[0] = costs[0];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = costs[i][j]+Math.min(dp[i-1][(j+1)%3], dp[i-1][(j+2)%3]);
            }
        }
        return Math.min(dp[length-1][0], Math.min(dp[length-1][1], dp[length-1][2]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] costs = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }
        System.out.println(minCost(costs));
    }
}