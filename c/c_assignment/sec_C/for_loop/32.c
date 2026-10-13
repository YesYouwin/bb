// Write a C program to calculate the sum of all even numbers between 1 and 100.

#include <stdio.h>

int main() {
    int ans = 0; 
    for(int i = 0; i < 101; i++) {
        if (i % 2 == 0) {
            ans = ans + i;
        }
    }
    printf("%d", ans);
}