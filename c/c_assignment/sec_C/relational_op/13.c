// Write a C program to input two numbers and check whether they are equal or not.

#include <stdio.h>

int main() {
    int a, b;

    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);

    if (a == b) {
        printf("A is Equal To B.");
    }
    else {
        printf("A is Not Equal To B.");
    }
    
}