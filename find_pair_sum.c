#include <stdio.h>
int sum(int a[], int n,int k)
{
    int flag=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=1;j<n;j++)
        if(a[i]+a[j]==k)
        {
            printf("sum found at index %d and %d\n",i,j);
            flag++;
        }
    }
    if(flag==0)
        printf("Pairr not found");
    return 0;
}
int main()
{
    int a[10]={1,2,3,4,5,6,7,8,9,10};
    int k=10;
    int n=sizeof(a)/sizeof(a[0]);
    sum(a,n,k);
    return 0;
}
