#include<stdio.h>
int main()
{
    int n, sum=0;
    printf("Enter the last number of the series:");
    scanf("%d",&n);
    printf("1+2+3+4+...+%d = ",n);
    for(int i=1;i<=n; i++)
    {
       sum=sum+i;
    }
    printf("%d", sum);
    getch();
}
