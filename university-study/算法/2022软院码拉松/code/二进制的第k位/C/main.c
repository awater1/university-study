#include <stdio.h>
#include <stdlib.h>

char invert(char S){
    return (char) ('0'+'1'-S);
}

char getResult(int n, int k) {
    if(k==1){
        return '0';
    }//TODO
    int mid = 1<<(n-1);
    if(k == mid){
        return '1';
    }
    else if (k < mid) {
        return getResult(n-1,k);
    }
    else {
        k = 2 * mid - k;
        return invert(getResult(n-1,k));
    }
}

int main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    printf("%c\n",getResult(n,k));
    return 0;
}
