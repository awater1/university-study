#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    scanf("%d",&n);
    int ans = n*(n+1)>>1;
    printf("%d",ans);
    return 0;
}
