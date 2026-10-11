// Calculate the average of three numbers entered by the user. 

#include <stdio.h>

int main() {
    float ans, a, b, c;
    
    printf("Enter The First Number: ");
    scanf("%f", &a);
    printf("Enter The Second Number: ");
    scanf("%f", &b);
    printf("Enter The Third Number: ");
    scanf("%f", &c);

    ans = (a + b + c) / 3;
    printf("The Average Of %.1f, %.1f, %.1f is %.2f", a, b, c, ans);
}