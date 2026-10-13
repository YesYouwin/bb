// Write a C program to calculate the sum of the first nnn natural numbers.

#include <stdio.h>

int main() {
    int n, ans = 0;
    printf("Enter A Number: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("\x1b[31mInvalid Input!!\x1b[0m");
    }
    else {
        while(n >= 0) {
            ans = n + ans;
            n = n - 1;
        }
    printf("%d",ans);
    }
}