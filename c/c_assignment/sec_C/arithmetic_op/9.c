// Write a C program to calculate the area of a circle using its radius.

#include <stdio.h>
#include <math.h>

int main() {
    int r,a;
    float PI = 3.141593;

    printf("Enter The Radius Of A Circle: ");
    scanf("%d", &r);

    a = PI * pow(r, 2);

    printf("The Area Of A Circle With Radius %d is %d", r, a);
}