#include <iostream>
#include <vector>
#include <string>

using namespace std;

bool isMajorityElement(vector<int> nums, int target){
    int num=0;
    int numSize = nums.size();
    for(int i=0;i<numSize;i++){
        num += (nums[i]==target);
    }
    return (num>(numSize>>1));
}

int main()

{

    vector<int> arr;

    string array_info;

    getline(cin, array_info);

    int sub = 0;

    bool flag = true;

    for (int i = 0; i < array_info.length(); i++) {

        if (array_info[i] == '-') {

            flag = false;

            continue;

        }

        if (array_info[i] == ',') {

            if (!flag) sub = -sub;

            arr.push_back(sub);

            sub = 0;

            flag = true;

        }

        else if (i == array_info.size() - 1) {

            int a = (int)array_info[i] - '0';

            sub = sub * 10 + a;

            if (!flag) sub = -sub;

            arr.push_back(sub);

            sub = 0;

            flag = true;

        }

        else {

            int a = (int)array_info[i] - '0';

            sub = sub * 10 + a;

        }

    }

    int target;

    cin >> target;

    bool ans = isMajorityElement(arr,target);

    cout << ans;

}
