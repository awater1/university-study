import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        System.out.println(new Main().minimizeTheDifference(nums,num));
    }

    public int minimizeTheDifference(int[][] nums, int num) {
        int m = nums.length,n = nums[0].length;
        boolean[][] dp = new boolean[m][4901];
        for(int i=0; i<n; i++){
            dp[0][nums[0][i]] = true;
        }
        for(int i=1; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=nums[i][j]+1; k< dp[0].length; k++){
                    if(dp[i][k]) {
                        continue;
                    }
                    dp[i][k] |= dp[i-1][k-nums[i][j]];
                }
            }
        }
        for(int i=0; i<=dp[0].length; i++){
            if(i <= num && dp[m-1][num-i] || dp[m-1][num+i]) {
                return i;
            }
        }
        return 0;

    }
}