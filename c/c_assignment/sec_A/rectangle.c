// Calculate the area and perimeter of a rectangle by taking it's length and breadth as input.

#include <stdio.h>

int main() {
    int len, bre, peri, area;
    
    printf("Enter The Length Of The Rectangle: ");
    scanf("%d", &len);
    printf("Enter The Breadth Of The Rectangle: ");
    scanf("%d", &bre);

    peri = 2 * (len + bre);
    area = len * bre;

    printf("The Perimeter of %d and %d is: %d\n", len, bre, peri);
    printf("The area of %d and %d is: %d\n", len, bre, area);
    return 0;
}