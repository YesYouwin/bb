//  Calculate the Gross Salary of an employee by taking Basic Salary, HRA, and DA as input. 

#include <stdio.h>

int main() {
    int bs, hra, da, gs;

    printf("Enter Your Basic Salary: ");
    scanf("%d", &bs);
    printf("Enter Your Health Reimbursement Arrangement: ");
    scanf("%d", &hra);
    printf("Enter Your Dearness Allowance: ");
    scanf("%d", &da);

    gs = bs + hra + da;

    printf("The Gross Salary Of Your By Taking Basic Salary: %d, HRA: %d, DA %d is: %d", bs, hra, da, gs);
}