#include <stdio.h>

// Function to calculate the sum of the series from 1 to n
int main() {
    int number, sum = 0;

    // Prompt user for the last number of the series
    printf("Enter the last number of the series: ");
    scanf("%d", &number);

    // Print the series and calculate the sum
    printf("1 + 2 + 3 + ... + %d = ", number);
    for (int i = 1; i <= number; i++) {
        sum += i; // Add the current number to the sum
    }

    // Display the result
    printf("%d\n", sum);

    return 0; // Return success
}

