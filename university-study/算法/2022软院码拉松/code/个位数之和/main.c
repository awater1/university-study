#include <stdio.h>
#include <stdlib.h>

int minimumNumbers(int num, int k) {
    if(num==0)return 0;
    for(int i=1;i<=num && num - i*k >= 0;i++){
        if((num-i*k)%10==0){
            return i;
        }
    }
    return -1;

}
int main()
{
    int num,k;
    scanf("%d%d",&num,&k);
    int n;
    n = minimumNumbers(num,k);
    printf("%d",n);
    return 0;
}
