// Calculate the area and circumference of a circle using the radius as input

#include <stdio.h>

int main() {
    float a, c, r;

    printf("Enter The Radius Of The Circle: ");
    scanf("%2f", &r);

    c = 2 * 3.14159 * r;
    a = 3.14159 * r * r;

    printf("The Area Of The Circle With The Radius %.2f is: %f\n", r, a);
    printf("The Circumference Of The Circle With The Radius %.2f is: %.f\n", r, c);
    return 0;
}


// You use float in the cases of decimal value integration such as pi.