#include<stdio.h>
int longestSubsequence(int* arr,int length, int difference) {
    if (length == 1) {
        return 0;
    }
    int count = 1;
    int ans = 0;
    for (int i = 0; i < length - 1; i++) {
        int temp = arr[i];
        for (int j = i+1; j < length; j++) {
            if(arr[j] == temp + difference){
                count++;
                temp = arr[j];
            }
        }
        ans = ans>count?ans:count;
        count = 1;
    }

    return ans;
}

int main(){
    int n;
    scanf("%d",&n);
    int length = n;
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int difference;
    scanf("%d",&difference);
    printf("%d",longestSubsequence(arr,length,difference));
}
