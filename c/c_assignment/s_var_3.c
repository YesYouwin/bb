// Swap the values of two variables using a third (temporary) variable. 

#include <stdio.h>

int main() {
    int a, b, c;
    c = 0;

    printf("Enter The First Variable Value: ");
    scanf("%d", &a);
    printf("Enter The Second Variable Value: ");
    scanf("%d", &b);

    if (a > c) {
        c = a;
        if (b > 0) {
            a = b;
            if (a != c) {
                b = c;
            }
        }
    }

    printf("The Variable A = %d\n", a);
    printf("The Variable B = %d\n", b);
}