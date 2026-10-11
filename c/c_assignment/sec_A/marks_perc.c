// Read the marks obtained in five subjects and calculate the total marks and percentage. 

#include <stdio.h>

int main() {
    int a, b, c, d, e, ob, total;
    float percentage;

    a = 67;
    b = 69;
    c = 72;
    d = 75;
    e = 67;
    total = 5 * 80;
    ob = a + b + c + d + e;
    percentage = ((float)ob/total) * 100;

    printf("The Total Marks Obtained By The Student Is: %d\n", ob);
    printf("The Total Percentage Obtained By The Student Is: %f", percentage);
}
