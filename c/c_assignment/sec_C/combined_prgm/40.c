// Write a C program to input a number and check whether it is prime.

#include <stdio.h>
#include <math.h>

int main() {
    int n;

    printf("Enter The Number To Check If It's Prime: ");
    scanf("%d", &n);
    int a = n;
    int j = sqrt(n);

    for(int i = 2; i < j + 1; i++) {
        if (n == 2 || n == 3 || n == 5 || n == 7 ) {
            printf("%d is A Prime Number.", a);
        }
        if (n % i == 0) {
            printf("%d is Not A Prime Number.", a);
        }
    }
}

//     if (n < 2) {
//    printf("%d is Not A Prime Number.", a);
//}