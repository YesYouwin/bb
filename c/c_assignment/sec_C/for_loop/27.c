// Write a C program to print all odd numbers between 1 and 50.

// Write a C program to print numbers from 1 to 10 using a for loop.

#include <stdio.h>

int main() {
    for (int i = 0; i < 51; i++) {
        if (i % 2 != 0) {
            printf("%d, ", i);
        }
    }
}