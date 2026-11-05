// Write a C program to input a number and check whether it is greater than 100.

#include <stdio.h>

int main() {
    int a;

    printf("Enter The Number For Comparison: ");
    scanf("%d", &a);

    printf("%s", a > 100 ? "Number is Greater Than 100":"Number is Not Greater Than 100");
}
