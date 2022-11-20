import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                grid[i][j] = sc.nextInt();

            }

        }

        System.out.println(new Main().minPathSum(grid));
    }

    public int minPathSum(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i!=0&&j!=0){
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
                if(i==0&&j!=0){
                    grid[i][j] += grid[i][j-1];
                }
                if (i !=0 && j ==0) {
                    grid[i][j] += grid[i-1][j];
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}