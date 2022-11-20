#include <iostream>

#include <vector>

using namespace std;

int recursion(int n, bool fromLeft) {
        if (n == 1) return 1;
        // TODO
        vector<int> a;
        int len = n;
        for(int i=1;i<n;i++){
            a[i]=i+1;
        }
        while(len != 1){
            if(fromLeft){
                for(int i=0;i<len;i++){
                    if((i+1)&1){
                        a.erase(a.begin()+i);
                        len--;
                    }
                }
                fromLeft = false;
            }
            else{
                for(int j=len-1;j>=0;j--){
                    if((len-j)&1){
                        a.erase(a.begin()+j);
                        len--;
                    }
                }
                 fromLeft = true;
            }
            for(int i=0;i<len;i++){
                cout<<a[i];
            }
        }
        return a.back();
}

int lastRemaining(int n) {
        return recursion(n,true);
}


int main()
{
int n;
cin>>n;
bool fromLeft = true;
if (n == 1) return 1;
        // TODO
        vector<int> a;
        int len = n;
        for(int i=1;i<n;i++){
            a[i]=i+1;
        }
        while(len != 1){
            if(fromLeft){
                for(int i=0;i<len;i++){
                    if((i+1)&1){
                        a.erase(a.begin()+i);
                        len--;
                    }
                }
                fromLeft = false;
            }
            else{
                for(int j=len-1;j>=0;j--){
                    if((len-j)&1){
                        a.erase(a.begin()+j);
                        len--;
                    }
                }
                 fromLeft = true;
            }
            for(int i=0;i<len;i++){
                cout<<a[i];
            }
        }
//cout<<lastRemaining(n);
return 0;

}
