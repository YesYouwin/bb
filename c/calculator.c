#include <stdio.h>

int main() {
    int x, y, total;
    char action, confirmation;

    printf("Enter The Primary Number: ");
    scanf("%d", &x);
    printf("Enter The Action That Will Happen With %d : ", x);
    scanf(" %c", &action);
    if (!(action == '+' || action == '-' || action == '/' || action == '*')) {
        printf("You Entered An Invalid Action.\n");
        printf("Allowed Actions are { + , - , / , * }");
        return 1;
    }
    printf("Enter The Secondary Number : ");
    scanf("%d", &y);
    printf("Great Do You Want To Do %d %c %d? (Y/N): ", x, action, y);
    scanf(" %c", &confirmation);
    if (!(confirmation == 'Y' || confirmation == 'N')) {
        printf("Please Answer Either 'Y' or 'N'");
        return 1;
    }

    if (confirmation == 'Y') {
        if (action == '+') {
            total = x + y;
            printf("The Sum Of %d and %d is: %d", x, y, total);
        }
        if (action == '-') {
            total = x - y;
            printf("The Substraction Of %d from %d is: %d", x, y, total);
        }
        if (action == '*') {
            total = x * y;
            printf("The Product Of %d and %d is: %d", x, y, total);
        }
        if (action == '/') {
            int rem = x % y;
            total = x / y; 
            printf("The Result Of %d divided by %d will be\n", x, y);
            printf("Quotient: %d\n", total);
            printf("Remainder: %d\n", rem);
        }  
    }
    else if(confirmation == 'N') {
        printf("Well Go Fuck Yourself Then.");
    }
    return 0;
}