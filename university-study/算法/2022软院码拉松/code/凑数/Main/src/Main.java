import java.util.*;

class Main {

    private static final String[] operators = new String[] { "+", "-", "*", "/" };
    private static final double EPSILON = 1e-6;

    public boolean judgePoint24(int[] nums) {
        List<Double> list = new ArrayList<Double>();
        for (int num : nums) {
            list.add((double) num);
        }
        return solve(list);

    }

    public boolean solve(List<Double> list) {
        if (list.size() == 0) {
            return false;
        }
        if (list.size() == 1) {
            return Math.abs(list.get(0) - 24) < EPSILON;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    List<Double> list2 = new ArrayList<>();
                    for (int k = 0; k < size; k++) {
                        if (k != i && k != j) {
                            list2.add(list.get(k));
                        }
                    }
                    for (int k = 0; k < 4; k++) {
                        if (k < 2 && i > j) {
                            continue;
                        }
                        if (k == 0) {
                            list2.add(list.get(i) + list.get(j));
                        } else if (k == 1) {
                            list2.add(list.get(i) * list.get(j));
                        } else if (k == 2) {
                            list2.add(list.get(i) - list.get(j));
                        } else if (k == 3) {
                            if (Math.abs(list.get(j)) < EPSILON) {
                                continue;
                            } else {
                                list2.add(list.get(i) / list.get(j));
                            }
                        }
                        if (solve(list2)) {
                            return true;
                        }
                        list2.remove(list2.size() - 1);
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main slt = new Main();

        int[] num = new int[4];

        for (int i = 0; i < 4; i++){
            num[i] = sc.nextInt();
        }

        System.out.print(slt.judgePoint24(num));

    }

}