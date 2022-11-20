import java.util.Scanner;

class Main {

    private static final int INT_MAX = (int) 1e9;

    public int gcd(int a,int b) {
        return b>0 ? gcd(b,a%b):a;
    }

    //从1到num可被a,b整除的数目
    public int divTermCount(int a, int b, int lcm, int num) {
        return num / a + num / b - num / lcm;
    }

    //二进制搜索(二分查找)
    public int nthMagicalNumber(int N, int A, int B) {
        int low = 1, high = INT_MAX, mid;
        int lcm = (A * B) / gcd(A, B);
        while (low < high) {
            mid = low + (high - low) / 2;
            if (divTermCount(A, B, lcm, mid) < N){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low % (INT_MAX + 7);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main slt = new Main();

        int num = sc.nextInt();

        int div1 = sc.nextInt();

        int div2 = sc.nextInt();

        System.out.print(slt.nthMagicalNumber(num,div1,div2));

    }

}