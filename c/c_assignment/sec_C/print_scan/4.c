// Write a C program to input two numbers and calculate their sum.

#include <stdio.h>

int main() {
    int a, b, sum;
    
    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);
    sum = a + b;
    printf("Sum Of %d and %d = %d", a, b, sum);
}