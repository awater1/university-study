import java.util.*;

public class Main {

public static void main(String arg[]) {

Scanner snc =new Scanner(System.in);

int n =snc.nextInt();

System.out.println(maximumEvenSplit(n));

}

public static List<Long> maximumEvenSplit(long finalSum) {
    List<Long> evens = new ArrayList<>();
		if ((finalSum & 1) == 1) {
			return evens;
		}
		long tmp = finalSum;
		Long cur = 2L;
		while (tmp - cur >= 0) {
			evens.add(cur);
			tmp -= cur;
			cur += 2;
		}
		if (tmp > 0) {
			tmp += evens.get(evens.size() - 1);
			evens.remove(evens.size() - 1);
			evens.add(tmp);
		}
		return evens;
	}
}
