#include <stdio.h>
#include <stdlib.h>
#define INT_MAX 1000000000
int gcd(int a,int b) {
    return b>0 ? gcd(b,a%b):a;
}

//从1到num可被a,b整除的数目
int divTermCount(int a, int b, int lcm, int num) {
    return num / a + num / b - num / lcm;
}

//二进制搜索（二分查找）
int nthMagicalNumber(int N, int A, int B) {
    int low = 1, high = INT_MAX, mid;
    int lcm = (A * B) / gcd(A, B);
    while (low < high) {
        mid = low + (high - low) / 2;
        if (divTermCount(A, B, lcm, mid) < N)
            low = mid + 1;
        else
            high = mid;
    }
    return low % (INT_MAX + 7);
}

int main()
{
    int N,A,B;
    scanf("%d%d%d",&N,&A,&B);
    printf("%d\n",nthMagicalNumber(N,A,B));
    return 0;
}
