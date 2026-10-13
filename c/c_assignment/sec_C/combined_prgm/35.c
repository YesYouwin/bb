// Write a C program to input two numbers and 
// display the larger number using relational operators and if-else

#include <stdio.h> 

int main() {
    int a, b;

    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);

    if (a > b) {
        printf("A is Greater Than B.");
    }
    else {
        printf("B is Greater Than A.");
    }
}