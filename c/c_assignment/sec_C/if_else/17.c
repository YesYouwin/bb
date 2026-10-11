// Write a C program to check whether a number is even or odd.

#include <stdio.h>

int main() {
    int a;
    
    printf("Enter The Number: ");
    scanf("%d", &a);

    if ((a % 2) == 0) {
        printf("The Number Is Even.");
    }
    else {
        printf("The Number Is Odd.");
    }
}
