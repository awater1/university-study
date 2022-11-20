#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int count=0;
    for(int k=1;k*(k+1)<=2*n;k++){
        if(((k%2==1)&&(n%k==0))||((k%2==0)&&(n%k!=0)&&(2*n%k==0))){
            count++;
        }
    }
    printf("%d",count);
    return 0;
}
