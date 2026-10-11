// Write a C program to check whether a number is divisible by both 5 and 11.

#include <stdio.h>

int main() {
    int a; 
    
    printf("Enter A Number: ");
    scanf("%d", &a);

    if (a % 5 == 0 && a % 11 == 0) {
        printf("%d is divisible by both 5 and 11.", 5);
    }
    else if (a % 5 == 0) {
        printf("%d is only divisible by 5 but not 11.", a);
    }
    else if (a % 11 == 0) {
        printf("%d is only divisible by 11 but not 5.", a);
    }
    else {
        printf("%d isn't divisible by both 5 and 11.", a);
    }
}