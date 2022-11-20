#include <stdio.h>
#include <stdlib.h>

int Hibonacci(int n);

int main()
{
    int n;
    scanf("%d",&n);
    int ans = Hibonacci(n);
    printf("%d",ans);
    return 0;
}

int Hibonacci(int n){
    int H[n+1];
    H[0]=0;H[1]=1;H[2]=1;
    for(int i=3;i<=n;i++){
        H[i] = H[i-1]+H[i-2]+H[i-3];
    }
    return H[n];
}
