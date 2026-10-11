// Write a C program to check whether a number is positive, negative, or zero.

#include <stdio.h>

int main() {
    int a;

    printf("Enter The Number: ");
    scanf("%d", &a);

    if (a > 0) {
        printf("A is a positive Integer.");
    }
    else if (a == 0) {
        printf("A is Zero.");
    }
    else {
        printf("A is a negative Integer.");
    }
}