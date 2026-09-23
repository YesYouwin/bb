// Calculate the compound interest and total amount for a given principal, rate of interest, and time. 
// pow(x,y) where x multiplies itself by the times of y so if:
// x = 10, y = 5. Therefore 10 * 10 * 10 * 10 * 10 = 10^5

#include <stdio.h>
#include <math.h>

int main() {
    float p, r, t, com;
    p = 15000;
    r = 18;
    t = 3;

    com = (p * pow((1 + r/100), t)) - p;
    printf("The Compound Interest of Principal %f, Rate Of Interest %f and Time %f is: %f",p, r, t, com);
}