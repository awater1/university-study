#include <stdio.h>
#include <stdlib.h>

int countNumOf1(int n){

    int count = 0;
    for(int i = 1;i <= n;i *= 10){
        count += (1+(n/i-1)/10)*i;
        if(n/i%10==1){
            count += 1-i+n%i;
        }
    }
    return count;
}

int main()
{
    int n;
    scanf("%d",&n);
    int count = countNumOf1(n);
    printf("%d",count);
    return 0;
}
