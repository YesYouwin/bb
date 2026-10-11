//  Swap the values of two variables without using a third variable. 

#include <stdio.h>

int main() {
    int a, b;

    printf("Enter The First Variable Value: ");
    scanf("%d", &a);
    printf("Enter The Second Variable Value: ");
    scanf("%d", &b);

    a = a + b;
    b = a - b;
    a = a - b;

    printf("The Variable A = %d\n", a);
    printf("The Variable B = %d\n", b);
}