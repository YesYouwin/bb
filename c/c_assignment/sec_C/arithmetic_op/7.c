// Write a C program to input two numbers and perform addition, subtraction, multiplication, division, and modulus operations.

#include <stdio.h>

int main() {

    int x, y;

    printf("Enter The First Number: ");
    scanf("%d", &x);
    printf("Enter The Second Number: ");
    scanf("%d", &y);

    printf("The Sum of %d and %d is: %d\n", x, y, x+y);
    printf("The Difference of %d and %d is: %d\n", x, y, x-y);
    printf("The Product of %d and %d is: %d\n", x, y, x*y);
    printf("The quotient of %d and %d is: %d\n", x, y, x/y);
    printf("The remainder of %d and %d is: %d\n", x, y, x%y);
    return 0;
}