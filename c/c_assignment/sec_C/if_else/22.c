// Write a C program to find the greatest among three numbers.

#include <stdio.h>

int main() {
    int a = 0;
    int num[3];

    printf("Enter 3 numbers separated by spaces or commas: ");

    if (scanf("%d%*[, ]%d%*[, ]%d", &num[0], &num[1], &num[2]) == 3) {
        printf("Taking %d, %d, %d as input.\n", num[0], num[1], num[2]);
    }
    else {
        printf("Invalid input\n");
        return 0;
    }
    
    for (int i = 0;i < sizeof(num) / sizeof(num[0]); i++) { 
        if (a < num[i]) {
            a = num[i];
        }
    }
    printf("The Largest Number = %d", a);
}


// Taking user input for array either requires loops for multiple lines
// or it can be done in a single line through allowing using to prefer a way by
// using %d%* and then a box bracket containing possibilities of splitup
// like in the example %d%*[, ] user can enter either space or comma.
// sizeof(num) / sizeof(num[0]) is how you get the size of array.