#include<stdio.h>
int main()
{
    int n,r, sum=0;

    printf("\nEnter a number:");
    scanf("%d",&n);
 int p=n;
    while(n!=0)
    {
        r=n%10;
        n=n/10;
       sum=sum+r*r*r;
    }
    if(sum==p)
        printf("\nThe number is  armstrong.");
    else
        printf("\nThe number is  not armstrong.");
    return 0;}

