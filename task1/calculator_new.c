#include <stdio.h>
#include <ctype.h>

int main() {
    printf("\t\t\t\t\t\t\t\tCALCULATOR\n\n\n\n");

    char ch;
    int a, b;

    printf("Enter the operator (+, -, *, /, %): ");
    scanf(" %c", &ch); // Added space before %c to consume any newline character

    printf("Enter two numbers:\n");
    printf("Number 1: ");
    scanf("%d", &a);
    printf("Number 2: ");
    scanf("%d", &b);

    switch (ch) {
        case '+': {
            int sum = a + b;
            printf("The result is %d\n", sum);
            break;
        }
        case '-': {
            int difference = a - b;
            printf("The result is %d\n", difference);
            break;
        }
        case '*': {
            int product = a * b;
            printf("The result is %d\n", product);
            break;
        }
        case '/': {
            if (b != 0) {
                float division = (float)a / b;
                printf("The result is %.2f\n", division); // Changed to format to 2 decimal places
            } else {
                printf("Error: Division by zero is not allowed.\n");
            }
            break;
        }
        case '%': {
            if (b != 0) {
                int remainder = a % b;
                printf("The result is %d\n", remainder);
            } else {
                printf("Error: Division by zero is not allowed.\n");
            }
            break;
        }
        default:
            printf("Invalid operator. Please input one of (+, -, *, /, %).\n");
    }

    return 0;
}
