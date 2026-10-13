// Write a C program to print 
// the multiplication tables from 1 to 10 using nested for loops.

#include <stdio.h>

int main() {
    for(int i = 1; i < 11; i++) {
        for(int j = 1; j < 11; j++) {
            int ans = i*j;
            printf((j == 10) ? "%d x %d = %d\n": "%d x %d  = %d\n", i, j, ans);
        }
        printf("\n");
    }
}