import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner snc =new Scanner(System.in);

        String str = snc.next();

        System.out.println(caculateRes(str));
    }

    public static char caculateRes(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = str.length()-1; i > 0; i-=2){
            if (str.charAt(i-1) == ':') {
                stack.push(str.charAt(i));

            }
            else {
                StringBuilder sb = new StringBuilder(str);
                sb.replace(i-2,i-1, String.valueOf(str.charAt(i-2)=='T'?str.charAt(i):stack.peek()));
                str = sb.toString();
                stack.pop();
            }
        }
        return str.charAt(0);
    }
}