// Write a C Program to generate prime number between 1-100.

#include <stdio.h>
#include <math.h>

int main() {
    printf("The Prime Numbers Between 1-100 Are \n");
    for (int i = 1; i <=100; i++) {                      // let's take numbers as i for iteration to 100
        int j = 1;                                       // j = True/false
        for (int x = 2; x <= sqrt(i) ; x++) {            // we know a number isn't prime if 2 factors until it's square root multiply to make i. So that'll be our limit
            if (i % x == 0) {                            // now we check if remainder of numbers until sqrt(i) is zero.
                j = 0;                                   // if yes then that means 2 numbers can multiply upto i
                break;
            }
        }
        if (j == 1) {                                    // otherwise it's a prime
            printf("%d, ", i);
        }
    }
}

