// Convert Temperature from Fahrenheit to Celsius

#include <stdio.h>

int main() {
    float fahrenheit = 84.20;
    float celsius = (fahrenheit - 32) * 5.0 / 9.0;

    printf("%.2f", celsius);
}