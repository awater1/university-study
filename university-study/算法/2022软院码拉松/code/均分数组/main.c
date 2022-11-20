#include <stdio.h>
#include <stdlib.h>

_Bool canPartition(int* nums, int n) {
    if (n < 2) {
        return 0;
    }
    int sum = 0, max = 0;
    for (int i = 0; i < n; ++i) {
        sum += nums[i];
        max = fmax(max, nums[i]);
    }
    int target = sum >>1;
    if (sum & 1 || max > target) {
        return 0;
    }
    int dp[target + 1];
    memset(dp, 0, sizeof(dp));
    dp[0] = 1;
    for (int i = 0; i < n; i++) {
        int num = nums[i];
        for (int j = target; j >= num; --j) {
            dp[j] |= dp[j - num];
        }
    }
    return dp[target];
}

int main()
{
    int n;
    scanf("%d",&n);
    int nums[n];
    for(int i=0;i<n;i++){
        scanf("%d",&nums[i]);
    }
    int ans = canPartition(nums,n);
    if(ans){
        printf("true");
    }
    else{
        printf("false");
    }
    return 0;
}
