#include <stdio.h>
#include <stdlib.h>

//快速排序
void quick_sort(int num[], int low, int high )
{
    int i,j,temp;
    int tmp;

    i = low;
    j = high;
    tmp = num[low];   //任命为中间分界线，左边比他小，右边比他大,通常第一个元素是基准数

    if(i > j)  //如果下标i大于下标j，函数结束运行
    {
        return;
    }

    while(i != j)
    {
        while(num[j] >= tmp && j > i)
        {
            j--;
        }

        while(num[i] <= tmp && j > i)
        {
            i++;
        }

        if(j > i)
        {
            temp = num[j];
            num[j] = num[i];
            num[i] = temp;
        }
    }

    num[low] = num[i];
    num[i] = tmp;

    quick_sort(num,low,i-1);
    quick_sort(num,i+1,high);
}

int main()
{
    int n;
    scanf("%d",&n);
    int nums[n];
    for(int i=0;i<n;i++){
        scanf("%d",&nums[i]);
    }
    quick_sort(nums,0,n-1);
    int tem;
    for(int k=1;k<n;k++){
        if(abs(nums[k]-nums[k-1])>tem){
            tem = abs(nums[k]-nums[k-1]);
        }
    }
    printf("%d",tem);
    return 0;
}
