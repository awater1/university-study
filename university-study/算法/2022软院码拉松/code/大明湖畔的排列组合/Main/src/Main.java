import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(new Main().getPermutation(n,k));
    }

    public String getPermutation(int n,int k) {
        int[] FAC = {1,1,2,6,24,120,720,5040,40320,362880};//阶乘
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            res.add(i);
        }

        k--;
        StringBuilder ans = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            int r = k % FAC[i-1];
            int t = k / FAC[i-1];
            k = r;
            ans.append(res.get(t));
            res.remove(res.get(t));
        }
        return ans.toString();//TODO
    }
}