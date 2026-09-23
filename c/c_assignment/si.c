// Calculate The Simple Interest And Total Amount By Taking Principal, Rate Of Interest, and Time As Input.

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
    printf("%f", si);
}