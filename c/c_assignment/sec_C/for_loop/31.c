// Write a C program to print numbers from 10 to 1 in reverse order.

#include <stdio.h>

int main() {
    for (int i = 10; i > 0; i--) {
        if (i == 1) {
            printf("%d", i);
        }
        else {
            printf("%d, ", i);
        }
    }
}