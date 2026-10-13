// Write a C program to count the digits of a positive integer using a loop.

#include <stdio.h>

int main() {
    int n, ans = 0;

    printf("Enter The Number: ");
    scanf("%d", &n);

    for(;n != 0;n /= 10, ++ans) {
        ;
    }
    printf("%d", ans);
}