// Write a C program to input marks of five subjects and calculate the total and percentage.

#include <stdio.h>

int main() {
    int per, sub[5];
    float tot;

    printf("Enter The Marks Of Five Subjects Separated With Space or Comma: ");

    if(scanf("%d%*[, ]%d%*[, ]%d%*[, ]%d%*[, ]%d", &sub[0], &sub[1], &sub[2], &sub[3], &sub[4])) {
        for(int i = 0; i < 5; i++) {
            tot = tot + sub[i];
        }
        per = (tot/500) * 100;
        printf("   Total   = %.2f\n", tot);
        printf("Percentage = %d\n", per);
    }
    else {
        printf("Invalid Input!");
    }
}