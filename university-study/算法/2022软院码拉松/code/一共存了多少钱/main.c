#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n],sum;
    for(int i=0;i<n;i++){
        int j = i+1;
        if(j%7 !=0){
            a[i] = (int)(j/7) + j%7;
        }
        else{
            a[i] = 6+j/7;
        }
        sum += a[i];
    }
    printf("%d",sum);
    return 0;
}
