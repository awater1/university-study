#include <stdio.h>
#include <stdlib.h>

int isPowerOf4(int n);
_Bool isPowerOfFour(int n) ;

int main()
{
    int num;
    scanf("%d",&num);
    if(isPowerOfFour(num)){
        printf("true");
    }
    else{
        printf("false");
    }
    return 0;
}

int isPowerOf4(int n){
    if(n<1){
        return 0;
    }
    int temp;
    while(n>1){
        temp = n>>2;
        if(temp<<2 < n){
            return 0;
            break;
        }
        n = n>>2;
    }
    return 1;
}

_Bool isPowerOfFour(int n) {
    return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
}
