import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author awater
 */
public class Main {
    private Map<String, Boolean> map = map = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(new Main().winOrLose(str));

    }

    public boolean winOrLose(String str){
        if (map.containsKey(str)) {
            return map.get(str);
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '+' && str.charAt(i - 1) == '+') {
                String s = str.substring(0, i - 1) + "--" + str.substring(i + 1);
                if (!winOrLose(s)) {
                    map.put(s, false);
                    return true;
                } else {
                    map.put(s, true);
                }
            }
        }
        return false;
    }
}