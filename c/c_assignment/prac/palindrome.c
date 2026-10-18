// Write a C program to find the reverse of an integer number and check whether it is palindrome or not.

#include <stdio.h>

int main() {
    int n, a, ans = 0;

    printf("Enter The Number To Check For Palindrome: ");
    scanf("%d", &n);
    a = n;

    if (a<0) {
        printf("%d is not a palindrome.", a); return 0;
    }

    while(n != 0) {
        ans = ans * 10 + n % 10;  // extract the last digit and add it to ans which will always have a zero at the end until n == 0
        n = n / 10;               // Now we remove that last digit we added into ans already
    }
    printf((ans == a) ? "%d is a palindrome." : "%d is not a palindrome.", a);
}

