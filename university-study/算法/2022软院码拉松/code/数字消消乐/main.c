#include <stdio.h>
#include <stdlib.h>

int recursion(int n, _Bool fromLeft) {
    if (n == 1) return 1;
    // TODO
    int len,next;
    int first = 1;
    int cnt = 1;
    while(n!=1){
        len = n;
        next = first + cnt;
        if(fromLeft){
            first = next;
            fromLeft = 0;
        }
        else{
            if(len&1){
                first = next;
            }
            fromLeft = 1;
        }
        n >>= 1;
        cnt <<= 1;
    }
    return first;
}

int lastRemaining(int n) {
    return recursion(n,1);
}

int main()
{
    long long n;
    scanf("%d",&n);

    printf("%d\n",lastRemaining(n));


    return 0;
}
