// Write a C program to input two integers and display the result of all relational operators (<, >, <=, >=, ==, !=).

#include <stdio.h>

int main() {
    int a,b;

    printf("Enter The First Number: ");
    scanf("%d", &a);
    printf("Enter The Second Number: ");
    scanf("%d", &b);

    printf("%s\n", (a > b) ? "A is Greater Than B" : "A is Not Greater Than B");
    printf("%s\n", (a < b) ? "A is Smaller Than B" : "A is Not Smaller Than B");
    printf("%s\n", (a <= b) ? "A is (Greater Than/ Equal To) B" : "A is Not (Greater Than/ Equal To) B");
    printf("%s\n", (a >= b) ? "A is (Smaller Than/ Equal To) B" : "A is Not (Smaller Than/ Equal To) B");
    printf("%s\n", (a == b) ? "A is Equal to B" : "A is Not Equal to B");
}