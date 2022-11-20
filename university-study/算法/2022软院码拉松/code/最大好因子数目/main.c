#include <stdio.h>
#include <stdlib.h>
int MOD = (int)(1e9+7);

long long Pow(long long x, int y){
    long long power = 1;
    while (y) {
        if ((y &1)==1){
            power *=x;
            power %= MOD;
        }
        x *= x;
        x %= MOD;
        y >>= 1;
    }
    return power;
}

int getGoodDivisor(int n) {
    if(n<=3){
        return n;
    }
    long long ans;
    int quotient = n / 3;
    int remainder = n % 3;
    if (remainder == 0) {
        ans = Pow(3, quotient);
    }
    else if (remainder == 1){
        ans = Pow(3, quotient - 1) * 4;
    }
    else {
        ans = Pow(3, quotient) * 2;
    }
    return ans%MOD;
}

int main()
{
    int p;
    scanf("%d",&p);
    printf("%d",getGoodDivisor(p));
    return 0;
}
