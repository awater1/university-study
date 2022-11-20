import java.util.Arrays;
import java.util.Scanner;

/**
 * @author awater
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(new Main().minNumber(nums));
    }

    public String minNumber(int[] nums){
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str,(x,y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s);
        }
        return sb.toString();
    }
}