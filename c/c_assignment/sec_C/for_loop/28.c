// Write a C program to print the multiplication table of a number entered by the user.

#include <stdio.h>

int main() {
    int a;

    printf("Enter The Number You Want The Multiplication Table Of: ");
    scanf("%d", &a);

    for (int i = 1; i < 11; i++) {
        int ans = a * i;
            printf((i != 10) ? "%d x %d  = %d\n" : "%d x %d = %d\n", a, i, ans);
    }
}