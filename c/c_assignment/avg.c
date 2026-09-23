// Calculate the average of three numbers entered by the user. 

#include <stdio.h>

int main() {
    int a, b, c;
    float ans;
    
    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);
    printf("Enter The Third Number: ");
    scanf("%d", &c);

    ans = (a + b + c) / 3;
    printf("The Average Of %d, %d, %d is %f", a, b, c, ans);
}