import java.util.Scanner;

class Main {
    public static int rob(int[] nums) {
        int sum = 0 , count = nums.length;
        while (count > 0){
            int i = maxTag(nums);
            sum += nums[i];
            nums[i] = 0;
            count--;
            if(i==0 && nums[i+1] != 0){
                nums[i+1] = 0;
                count--;
            } else if (i == nums.length - 1 && nums[i-1] != 0) {
                nums[i-1] = 0;
                count--;
            }else if(i>0 && i<nums.length-1 ){
                if(nums[i-1]!=0){
                    nums[i-1] = 0;
                    count--;
                }
                if(nums[i+1]!= 0){
                    nums[i+1] = 0;
                    count--;
                }
            }
        }
        return sum;
    }

    private static int maxTag(int[] nums) {
        int tag = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                tag = i;
            }
        }
        return tag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = scanner.nextInt();
        }
        System.out.println(rob(ans));
    }
}