// Write a C program to calculate the factorial of a number.

#include <stdio.h>

int main() {
    int n, ans = 0;

    printf("Enter The Integer You Want Factorial Of: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("\x1b[31mInvalid Input!!\x1b[0m");
    }
    else {
        ans = n;
        while(n > 1) {
            ans = ans * (n - 1);
            n = n - 1;
        }
        printf("%d",ans);
    }
}