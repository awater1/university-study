import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final int N = 200010;
    private final int MOD = (int)(1e9+7);
    private int[] trie = new int[N];

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner snc =new Scanner(System.in);
        while (snc.hasNextInt()){
            nums.add(snc.nextInt());
        }
        System.out.println(new Main().effectiveSub(nums));
    }

    int query(int x) {
        int ans = 0;
        for (int i = x; i > 0; i -= i & -i) {
            ans += trie[i];
        }
        return ans;
    }
    public int effectiveSub(ArrayList<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        int[] sum = new int[n + 10];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + (nums.get(i-1) == 0 ? -1 : 1);
        }
        for (int i = 0; i <= n; i++) {
            int t = sum[i] + n + 1;
            ans = (ans + query(t - 1))%MOD;
            for (int j = t; j <= 2 * n + 1; j += j & -j) {
                trie[j] += 1;
            }
        }
        return ans;
    }
}