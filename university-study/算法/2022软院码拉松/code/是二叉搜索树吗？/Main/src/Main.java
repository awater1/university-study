import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replace("[", "").replace("]", "");
        String[] strList = str.split(",");
        int[] arr = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            arr[i] = Integer.parseInt(strList[i]);
        }
        System.out.print(new Main().judge(arr));
    }

    public boolean judge(int[] arr) {
        return dfs(arr,0,arr.length-1);
    }

    private boolean dfs(int[] arr,int left,int root){
        if(left>=root) {
            return true;
        }
        int right;
        int i=left;
        //寻找右节点
        while(i<root&&arr[i]<arr[root]) {
            i++;
        }
        right=i;
        // 检查右子树有没有比根节点小的
        for(i+=1;i<root;i++){
            if(arr[i]<arr[root]) {
                return false;
            }
        }
        //划分为左右两个子序列
        boolean l=dfs(arr,left,right-1);
        boolean r=dfs(arr,right,root-1);
        return l&&r;
    }

}