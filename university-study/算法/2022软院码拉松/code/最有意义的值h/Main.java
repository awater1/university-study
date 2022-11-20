import java.util.*;

public class Main {
    public static void main(String arg[]) {
        try (Scanner snc = new Scanner(System.in)) {
			int n =snc.nextInt();

			int arr[]=new int[n];
			for(int i=0;i<n;i++){
			    arr[i]=snc.nextInt();
			}
			Main main=new Main();
			System.out.println(main.hIndex(arr));
		}
    }

	//快速排序
    public int hIndex(int[] arr) {
        quicksort(arr, 0, arr.length-1);
        int h = 0;
        int length = arr.length;
        for(int i = 0;i< length;i++){
            if(arr[i]>= length-i){
                h = length - i;
                break;
            }
        }
        return h;
    }

    public static void quicksort(int[] a, int low, int high) {
		int i,j;
		if (low>high) {
			return;
		}
		i=low;
		j=high;
		int temp=a[low];
		while(i<j){
			while ( temp<=a[j] && i<j) {
				j--;
			}
			while ( temp>=a[i] && i<j) {
				i++;
			}
			
			if (i<j) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		
		a[low]=a[i];
		a[i]=temp;
		quicksort(a, low, j-1);
		quicksort(a, j+1, high);	
	}

}