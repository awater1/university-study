import java.util.Scanner;

class Main {
    public static int longestSubsequence(int[] arr, int difference) {
        if (arr.length == 1) {
            return 0;
        }
        int count = 1;
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == temp + difference){
                    count++;
                    temp = arr[j];
                }
            }
            ans = Math.max(ans,count);
            count = 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int difference = scanner.nextInt();
        System.out.println(longestSubsequence(arr,difference));
    }
}