#include <stdio.h>
#include <stdlib.h>

_Bool judgeSquareSum(int c) {
    for (long a = 0; a * a <= c; a++) {
        double b = sqrt(c - a * a);
        if (b == (int)b) {
            return 1;
        }
    }
    return 0;
}

int main()
{
    int c;
    scanf("%d",&c);
    printf("%d",judgeSquareSum(c));
    return 0;
}
