import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        String bnString = scanner.nextLine();
        String cnString = scanner.nextLine();
        int[] bn = Arrays.stream(bnString.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cn = Arrays.stream(cnString.split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.print(new Main().getResult(k, bn, cn, m, n, p));
    }

    public int getResult(int k, int[] bn, int[] cn, int m, int n, int p) {
        int[] a = new int[n];

        for(int i = 0; i < k; i++) {
            a[i] = bn[i];
        }

        for (int i = k;i < n; i++){
            for (int j = 0; j < k; j++) {
                a[i] += cn[j] * a[i-j-1];
            }
        }

        int sum = 0;
        if(m < n){
            for (int i = m-1; i < n; i++) {
                sum += a[i];
            }
        }
        return sum%p;//TODO
    }
}