#include<stdio.h>
#include<ctype.h>
#include<math.h>

int main()
{
    printf("\t\t\t\t\t\t\t\tCALCULATOR\n\n\n\n");
    char ch;
    int a, b;
    printf("Enter the operator:");
    scanf("%c", &ch);
    switch(ch)
    {
    case '+':
        {
           printf("Enter two numbers:");
           printf("Number1:");
           scanf("%d", &a);
            printf("Number2:");
           scanf("%d", &b);
           int sum = a+b;
           printf("The result is %d", sum);
        }
        break;
    case '-':
        {
           printf("Enter two numbers:");
           printf("Number1:");
           scanf("%d", &a);
            printf("Number2:");
           scanf("%d", &b);
           int sum = a-b;
           printf("The result is %d", sum);
        }
        break;
    case '*':
        {
           printf("Enter two numbers:");
           printf("Number1:");
           scanf("%d", &a);
            printf("Number2:");
           scanf("%d", &b);
           int sum = a*b;
           printf("The result is %d", sum);
        }
        break;
    case '/':
        {
           printf("Enter two numbers:");
           printf("Number1:");
           scanf("%d", &a);
            printf("Number2:");
           scanf("%d", &b);
           float sum = (float)a/b;
           printf("The result is %f", sum);
        }
        break;
    case '%':
        {
           printf("Enter two numbers:");
           printf("Number1:");
           scanf("%d", &a);
            printf("Number2:");
           scanf("%d", &b);
           int sum = a%b;
           printf("The result is %d", sum);
        }
        break;
        default:
            printf("Please input an operator.");

    }


getch();


}
