// Write a C program to find the greater of two numbers using if-else.

#include <stdio.h>

int main() {
    int a, b;
    
    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);

    printf("%s\n", a<b ? "B is Greater Than A." : "A is Greater Than B.");
}