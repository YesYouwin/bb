// Write a C program to check whether a year is a leap year.

#include <stdio.h>

int main() {
    int year;

    printf("Enter A Year: ");
    scanf("%d", &year);

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        printf("%d is a Leap Year.", year);
    }
    else {
        printf("%d is not a Leap Year.", year);
    }
}