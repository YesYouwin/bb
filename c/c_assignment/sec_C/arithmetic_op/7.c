// Write a C program to input two numbers and perform addition, subtraction, multiplication, division, and modulus operations.

#include <stdio.h>

int main() {

    int x, y;

    printf("Enter The First Number: ");
    scanf("%d", &x);
    printf("Enter The Second Number: ");
    scanf("%d", &y);

    int a = x + y;
    int b = x - y;
    int c = x * y;
    int d = x / y;
    int e = x % y;

    printf("The Sum of %d and %d is: %d\n", x, y, a);
    printf("The Difference of %d and %d is: %d\n", x, y, b);
    printf("The Product of %d and %d is: %d\n", x, y, c);
    printf("The quotient of %d and %d is: %d\n", x, y, d);
    printf("The remainder of %d and %d is: %d\n", x, y, e);
    return 0;
}