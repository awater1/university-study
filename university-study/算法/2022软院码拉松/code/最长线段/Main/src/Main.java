import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        for(int i=0;i<m;i++) {

            for(int j=0;j<n;j++) {

                grid[i][j] = sc.nextInt();

            }

        }
        System.out.println(new Main().longestLine(grid));
    }

    public int longestLine(int[][] grid){

        int len_r = grid.length;
        int len_c = grid[0].length;
        int length = 0;

        int[][] horizontal = new int[len_r][len_c];
        int[][] vertical = new int[len_r][len_c];
        int[][] diagonal = new int[len_r][len_c];
        int[][] antiDiagonal = new int[len_r][len_c];

        for (int i = 0; i < len_r; i++) {
            for (int j = 0; j < len_c; j++) {
                if(grid[i][j]==0){
                    horizontal[i][j] = 0;
                    vertical[i][j] = 0;
                    diagonal[i][j] = 0;
                    antiDiagonal[i][j] = 0;
                }
                else {
                    horizontal[i][j] = j > 0 ? horizontal[i][j - 1] + 1 : 1;
                    vertical[i][j] = i > 0 ? vertical[i-1][j] + 1 : 1;
                    diagonal[i][j] = i>0 && j>0 ? diagonal[i-1][j-1] + 1 : 1;
                    antiDiagonal[i][j] = i>0 && j<len_c-1 ? antiDiagonal[i-1][j+1] : 1;

                    length = Math.max(length, antiDiagonal[i][j]);
                    length = Math.max(length, diagonal[i][j]);
                    length = Math.max(length, vertical[i][j]);
                    length = Math.max(length, horizontal[i][j]);
                }
            }
        }

        return length;
    }
}