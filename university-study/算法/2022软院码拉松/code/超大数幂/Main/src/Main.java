import java.util.Scanner;

public class Main {
    public static int MOD = 107;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int n = sc.nextInt();

        int[] b = new int[n];

        for(int i=0;i<n;i++) {

            b[i] = sc.nextInt();

        }

        int power = 1;

        for (int i = n-1; i >= 0; i--) {
            power = (int) ((long)power*pow(a,b[i])%MOD);
            a = pow(a,10);
        }

        System.out.println(power);

    }

    public static int pow(int x, int y){
        int power = 1;
        while (y > 0) {
            if ((y &1)==1){
                power = (int)((long)power*x%MOD);
            }
            x = (int)((long)x*x%MOD);
            y >>= 1;
        }
        return power;
    }

}