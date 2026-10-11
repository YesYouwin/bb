// Write a C program to check whether a student has passed or failed based on marks.

#include <stdio.h>

int main() {
    int a;

    printf("Enter Your Marks: ");
    scanf("%d", &a);

    printf("%s\n", (a > 33) ? "\x1b[32mYou Passed!\x1b[0m":"\x1b[31mYou Failed!\x1b[0m");
}