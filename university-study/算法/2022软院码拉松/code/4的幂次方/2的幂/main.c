#include <stdio.h>
#include <stdlib.h>

_Bool reorderedPowerOf2(int n){
    int a[31][10]={0};//数组a用来保存2的各次幂的各组成数字频率
    a[0][1]++;//2^0=1
    int m = 1;
    for(int i=1;i<=30;i++)
    {
        m *= 2;
        for(int b=m;b;b/=10){
            a[i][b%10]++;
        }
    }
    int c[10]={0};//数组c用来保存组成n的各个数字的频率
    while(n)
    {
        c[n%10]++;
        n/=10;
    }
    for(int i=0;i<=30;i++)//将组成n的数字频率与2的各次幂的数字频率对比，相同则说明是
    {
        int flag=0;
        for(int j=0;j<10;j++)
        {
            if(a[i][j]==c[j]){
                flag=1;
                continue;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1)
        return 1;
    }
    return 0;   
}

int main()
{
    int n;
    scanf("%d",&n);
    if(reorderedPowerOf2(n)){
        printf("true");
    }
    else{
        printf("false");
    }
    return 0;
}
