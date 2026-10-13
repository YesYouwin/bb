// Write a C program to calculate the sum of digits of a number.

#include <stdio.h>

int main() {
    int sum = 0, n, ans = 1;

    printf("Enter A Number: ");
    scanf("%d", &n);

    for(;n != 0;n /= 10, ++ans) {
        sum = sum + ans;
    }
    printf("%d", sum);
}