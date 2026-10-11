// Write a C program to input a student's name, roll number, and marks, and display them.

#include <stdio.h>

int main() {
    char str[50]; // To declare a string you have to give it a proper 
    int rn, mark;

    printf("Enter Your Name: ");
    scanf("%s", str);
    printf("Enter Your Roll Number: ");
    scanf("%d", &rn);
    printf("Enter Your Marks: ");
    scanf("%d", &mark);

    printf("Name = %s\n", str);
    printf("Roll Number = %d \n", rn);
    printf("Marks = %d", mark);
}