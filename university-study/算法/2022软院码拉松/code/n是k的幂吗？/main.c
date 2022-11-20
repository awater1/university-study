#include <stdio.h>
#include <stdlib.h>

int isPowerOfN(int n,int k);

int main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    printf("%d",isPowerOfN(n,k));
    return 0;
}

int isPowerOfN(int n,int k){
    int temp;
    while(n>1 || n<=-1){
        temp = n/k;
        if(temp*k != n){
            return 0;
            break;
        }
        n /= k;
    }
    return 1;
}
