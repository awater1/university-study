#include <iostream>

#include <vector>

using namespace std;

int minSelect(vector<int>& nums, int n) {
    int ans=0;int sum = 0;
    if(sum==n){return ans;}
    else if(sum>n){

        return -1;
    }
    else{
         int first = nums.front();
         int last = nums.back();
         if(sum+first<=n){
                sum+=first;
                nums.erase(nums.begin());
                ans++;
                minSelect(nums,n);
        }
        else if(sum+last<=n){
                sum+=last;
                nums.erase(nums.end());
                ans++;
                minSelect(nums,n);
        }
    }

}

int main()

{

int n;

cin>>n;

vector<int> nums;

int temp=0;

while(cin >> temp)

{

nums.push_back(temp); //Ìî³äÊı¾İ

}


vector<int> result;
for(int i=0;i<n;i++){
    result.push_back(minSelect(nums,n));
}
cout<<minSelect(nums,n);

return 0;


}
