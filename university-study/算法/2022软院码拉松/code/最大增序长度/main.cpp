#include<bits/stdc++.h>

using namespace std;

int sloution(vector<int>& nums){
     int n = (int)nums.size();
     if (n == 0) {
        return 0;
    }
     vector<int> dp(n, 0);
     for(int i =0;i<n;i++){
        dp[i] = 1;
        for(int j=0;j<i;j++){
            if(nums[i]>nums[j]){
                dp[i] = max(dp[i],dp[j]+1);
            }
        }
     }

     return *max_element(dp.begin(), dp.end());
}

int main(){

int n;

cin>>n;

vector<int> nums;

for(int i = 0; i < n; ++i){

int temp;

cin>>temp;

nums.push_back(temp);

}

cout<<sloution(nums);

return 0;

}
