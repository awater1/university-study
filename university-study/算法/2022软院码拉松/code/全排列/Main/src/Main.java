import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author awater
 */
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        new Main().perm(n,nums,0);
    }

    public void perm(int n, List<Integer> nums, int first){
        if(first == n){
            for (Integer num : nums) {
                System.out.print(num);
            }
            System.out.println();
        }
        else{
           for (int i = first; i < n; i++) {
               Collections.swap(nums,first,i);
               perm(n,nums,first+1);
               Collections.swap(nums,first,i);
           }
       }
    }


}
