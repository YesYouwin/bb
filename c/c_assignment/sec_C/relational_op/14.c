// Write a C program to input two numbers and determine which number is greater.

#include <stdio.h> 

int main() {
    int a, b;

    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);

    printf("%s", a > b ? "A is Greater Than B":"B is Greater Than A");
}