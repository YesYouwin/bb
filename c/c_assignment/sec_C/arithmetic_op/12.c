// Write a C program to input the principal, rate, and time and calculate simple interest.

#include <stdio.h>

int main() {
    float p, r ,t, si;

    printf("Enter The Principal Amount: ");
    scanf("%f", &p);
    printf("Enter The Rate Of Interest: ");
    scanf("%f", &r);
    printf("Enter The Time:(In Years) ");
    scanf("%f", &t);

    si = (p * r * t) / 100;
    printf("%.2f", si);
}