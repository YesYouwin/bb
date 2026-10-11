// Read two integers and display their sum, difference, product, quotient and remainder.

#include <stdio.h>

int main() {
    int x = 26;
    int y = 10;

    int a = x + y;
    int b = x - y;
    int c = x * y;
    int d = x / y;
    int e = x % y;

    printf("The Sum of %d and %d is %d\n", x, y, a);
    printf("The Difference of %d and %d is %d\n", x, y, b);
    printf("The Product of %d and %d is %d\n", x, y, c);
    printf("The quotient of %d and %d is %d\n", x, y, d);
    printf("The remainder of %d and %d is %d\n", x, y, e);
    return 0;
}