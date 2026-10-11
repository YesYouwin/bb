// Write a C program to check whether a person is eligible to vote based on age.

#include <stdio.h>

int main() {
    int a;

    printf("Enter Your Age: ");
    scanf("%d", &a);

    printf("%s\n", (a > 18) ? "\x1b[32mYou are Eligible To Vote\x1b[0m" : "\x1b[31mYou are Not Eligible To Vote\x1b[0m");
}