#include<bits/stdc++.h>

using namespace std;

int sloution(vector<int>& nums){
    int left = 0;
    int right = nums.size()-1;
    int area=0;
    int temp;
    while(left<right){
         temp = min(nums[left],nums[right])*(right-left);
         area = max(area,temp);
         if(nums[left]<=nums[right]){
            left++;
         }
         else{
            right--;
         }
    }
    return area;
}

int main(){

int n;

cin>> n;

vector<int> nums;

for(int i = 0; i < n; ++i){

int temp;

cin>>temp;

nums.push_back(temp);

}

cout<<sloution(nums);

return 0;

}
