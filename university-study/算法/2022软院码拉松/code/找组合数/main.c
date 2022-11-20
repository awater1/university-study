#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int nums[n];
    for(int i=0;i<n;i++){
        scanf("%d",&nums[i]);
    }
    int target;
    scanf("%d",&target);
    int dp[target+1];
    memset(dp, 0, sizeof(dp));
    dp[0] = 1;
    for(int i=1;i<+target;i++){
        for(int j=0;j<n;j++){
            if(nums[j]<=i  && dp[i - nums[j]] < INT_MAX - dp[i]){
                dp[i] += dp[i-nums[j]];
            }
        }
    }
    printf("%d",dp[target]);
    return 0;
}
