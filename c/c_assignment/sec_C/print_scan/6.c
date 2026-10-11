// Write a C program to input the length and breadth of a rectangle and calculate its area.

#include <stdio.h>

int main() {
    int len, bre, area;
    
    printf("Enter The Length Of The Rectangle: ");
    scanf("%d", &len);
    printf("Enter The Breadth Of The Rectangle: ");
    scanf("%d", &bre);

    area = len * bre;

    printf("The area of %d and %d is: %d\n", len, bre, area);
    return 0;
}