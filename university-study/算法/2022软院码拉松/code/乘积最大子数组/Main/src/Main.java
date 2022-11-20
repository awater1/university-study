import java.util.Scanner;

class Main {
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tmax = 1;int tmin = 1;

        for(int num:nums){
            if (num<0) {
                int temp = tmax;
                tmax = Math.max(tmin*num,num);
                tmin = Math.min(temp*num,num);
            }else if(num > 0){
                tmax = Math.max(tmax*num,num);
                tmin = Math.min(tmin*num,num);
            }else {
                tmax = 1;
                tmin = 1;
                max = Math.max(0,max);
                continue;
            }
            max = Math.max(tmax,max);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(maxProduct(nums));
    }
}