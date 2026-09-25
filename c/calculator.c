#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int main() {
    float x, y, total;
    char action, confirmation;
    bool hasresult = false;
    confirmation = 'N';

    printf("Enter The Primary Number: ");
    scanf("%f", &x);

    while (confirmation != 'Y') {
        if (hasresult) {
            x = total;
        }
        
        printf("Enter The Action That Will Happen With %.2f : ", x);
            scanf(" %c", &action);
        if (!(action == '+' || action == '-' || action == '/' || action == '*' || action == 'x')) {
            printf("You Entered An Invalid Action.\n");
            printf("Allowed Actions are { + , - , / , * }");
            continue;
        }
        printf("Enter The Secondary Number : ");
        scanf("%f", &y);

        if (action == '+') {
            total = x + y;
            printf("The Sum Of %.2f and %.2f is: %.2f\n", x, y, total);
            hasresult = true;
        }
        if (action == '-') {
            total = x - y;
            printf("The Substraction Of %.2f from %.2f is: %.2f\n", x, y, total);
            hasresult = true;
        }
        if (action == '*' || action == 'x') {
            total = x * y;
            printf("The Product Of %.2f and %.2f is: %.2f\n", x, y, total);
            hasresult = true;
        }
        if (action == '/') {
            float rem = fmod(x, y);
            total = x / y; 
            printf("The Result Of %.2f divided by %.2f will be\n", x, y);
            printf("Quotient: %.2f\n", total);
            printf("Remainder: %.2f\n", rem);
            hasresult = true;
        }
        hasresult = true;

        printf("Great! Are You Finished Yet? (Y/N): ");
        scanf(" %c", &confirmation);
        if (!(confirmation == 'Y' || confirmation == 'N' )) {
            printf("You Entered An Invalid Answer.\n");
            printf("Please Choose Between (Y/N)");
            continue;
        }
        
    }
    printf("Great! Your Final Answer Is:  %.2f", total);
    return 0;
}