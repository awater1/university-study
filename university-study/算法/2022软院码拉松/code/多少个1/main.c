#include <stdio.h>
#include <stdlib.h>

int countDigitOne(int n) {
    // mulk 表示 10^k
    // 在下面的代码中，可以发现 k 并没有被直接使用到（都是使用 10^k）
    // 但为了让代码看起来更加直观，这里保留了 k
    long long mulk = 1;
    int ans = 0;
    for (int k = 0; n >= mulk; ++k) {
        ans += (n / (mulk * 10)) * mulk + fmin(fmax(n % (mulk * 10) - mulk + 1, 0LL), mulk);
        mulk *= 10;
    }
    return ans;
}

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
