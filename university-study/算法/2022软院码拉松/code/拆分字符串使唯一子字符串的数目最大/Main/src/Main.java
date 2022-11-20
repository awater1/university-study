import java.util.*;

class Main {

    private int maxSplit = 1;

    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        backTrack(0,0,s,set);
        return maxSplit;
    }

    public void backTrack(int index, int split, String s, Set<String> set) {
        int length = s.length();
        if(index < length){
            for (int i = index; i < length; i++) {
                String str = s.substring(index,i+1);
                if (set.add(str)) {
                    backTrack(i+1,split+1,s,set);
                    set.remove(str);
                }
            }
        }
        else {
            maxSplit = Math.max(maxSplit,split);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Main slt = new Main();

        System.out.print(slt.maxUniqueSplit(str));

    }

}