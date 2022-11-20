import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int inputValue = sn.nextInt();
        System.out.println(new Main().lastRemaining(inputValue));
    }

    /**
     * @param n 数组长度
     * @param fromLeft ture 从左到右，false从右到左
     * @return
     */
    public int recursion(int n, boolean fromLeft) {
        if (n == 1) return 1;
        // TODO
        ArrayList<Integer> a =new ArrayList<Integer>();
        int number=1;
        for(int num:a){
            num=number;
            number++;
        }
        while(a.size() != 1){
            if(fromLeft){
                for(int i=0;i<a.size();i++){
                    if((i+1)%2==1){
                        a.remove(i);
                        System.out.println(a.size());
                    }
                }
                fromLeft = false;
            }
            else{
                for(int j=a.size()-1;j>=0;j--){
                    if((a.size()-j)%2==1){
                        a.remove(j);
                        System.out.println(a.size());
                    }
                }
                 fromLeft = true;
            }
        }
        return a.get(0);

    }

    public int lastRemaining(int n) {
        return recursion(n, true);
    }
}
