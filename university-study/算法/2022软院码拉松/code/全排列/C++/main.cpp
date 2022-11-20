#include <iostream>
#include <algorithm>
#include <iterator>
#include <vector>
using namespace std;

vector<int> vec;
vector<bool> dict;
vector<int> ans;

void permutation(int n, int k){
    if(k > n - 1){
        copy(ans.begin(), ans.end(), ostream_iterator<int>(cout, ""));
        cout << endl;
        return;
    }

    for(int i = 0; i < n; i++){
        if(!dict[i]){
           dict[i] = true;
           ans[k] = vec[i];
           permutation(n,k + 1);
           dict[i] = false;
         }
     }
 }

int main(){
    int n;
    cin >> n;
    for(int i = 0; i < n; i++){
        vec.push_back(i + 1);
        dict.push_back(false);
     }
    ans.assign(n,0);
    permutation(n,0);
    return 0;
}
