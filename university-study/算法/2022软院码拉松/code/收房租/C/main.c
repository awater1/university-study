#include<stdio.h>

int rob(int* nums,int n) {
    int sum = 0 , count = n;
    while (count > 0){
        int i = MaxTag(nums,n);
        sum += nums[i];
        nums[i] = 0;
        count--;
        if(i==0 && nums[i+1] != 0){
            nums[i+1] = 0;
            count--;
        } else if (i == n - 1 && nums[i-1] != 0) {
            nums[i-1] = 0;
            count--;
        }else if(i>0 && i<n-1 ){
            if(nums[i-1]!=0){
                nums[i-1] = 0;
                count--;
            }
            if(nums[i+1]!= 0){
                nums[i+1] = 0;
                count--;
            }
        }
    }
    return sum;
}

int MaxTag(int* nums,int n) {
    int tag = 0;
    for (int i = 1; i < n; i++) {
        if(nums[i]>nums[i-1]){
            tag = i;
        }
    }
    return tag;
}
int main(){
    int n;
    scanf("%d",&n);
    int nums[n];
    for(int i=0;i<n;i++){
        scanf("%d",&nums[i]);
    }
    printf("%d",rob(nums,n));
    return 0;
}
