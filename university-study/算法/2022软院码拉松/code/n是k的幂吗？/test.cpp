#include <iostream>

using namespace std;

bool isPP(int n, int k);

int main()

{

int n=0, k=0;

cin >> n >> k;

cout<<isPP(n, k);

return 0;

}

bool isPP(int n, int k)

{
if(n==0)return 0;
if(n==1&&k==1)return 1;
while(n%k==0){
    n /=k;
}
if(n==1)return 1;
else return 0;



}
