#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int left=0;
    int right=n;
    while(left<right){
        int mid=(left+right+1)>>1;
        int count=0;
        for(int j=n-1;j>=0;j--){
            if(a[j]>=mid){
                count++;
            }
        }

        if(count>=mid){
            left = mid;
        }else{
            right = mid-1;
        }
    }
    printf("%d",left);
    return 0;
}
