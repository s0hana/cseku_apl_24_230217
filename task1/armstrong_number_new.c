#include<stdio.h>
int main()
{
    int number, remainder, sum=0;
    printf("\nEnter a number:");
    scanf("%d",&number);

    int originalNumber = number;// Storing the original number for checking later


    // Separates all digits, cubes each digit, and adds them together to check if the sum equals the original number.
    while(number!=0)
    {
        remainder=number%10;// Getting the last digit
        number = number/10;// Removing the last digit
       sum = sum + remainder*remainder*remainder;// Adding the cube of the digit
    }


    // Checking if the sum equals the original number
    if(sum==originalNumber)
        printf("\nThe number is  armstrong.\n");
    else
        printf("\nThe number is  not armstrong.\n");
    return 0;
}
