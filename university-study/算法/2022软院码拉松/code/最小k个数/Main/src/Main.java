import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(new Main().removeKdigits(num,k));
    }

    public String removeKdigits(String num, int k) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : num.toCharArray()) {
            while (!stk.isEmpty() && c < stk.getLast() && k > 0) {
                stk.pollLast();
                k--;
            }
            stk.addLast(c);
        }
        String res = stk.stream().map(Object::toString).collect(Collectors.joining());
        res = res.substring(0, res.length() - k).replaceAll("^0+", "");
        return res.isEmpty() ? "0" : res;
    }

}
