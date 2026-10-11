// Convert a given number of days into years, weeks, and remaining days. 

#include <stdio.h>

int main() {
    int days, year, weeks, remaining_days_year, remaining_days_week, r1, r2;

    printf("Enter The Number Days: ");
    scanf("%d", &days);

    year = days / 365;
    weeks = days / 7;

    remaining_days_year = days % 365;
    remaining_days_week = days % 7;

    r1 = remaining_days_year / 7;
    r2 = remaining_days_year % 7;

    printf("The Number Of Years With %d days would be: %d years with %d days remaning\n", days, year, remaining_days_year);
    printf("The Number Of Weeks With %d days would be: %d weeks with %d days remaning\n", days, weeks, remaining_days_week);
    printf("So The Total Number Of Years, Weeks And Days Would Be:\n");
    printf("Years: %d", year);
    printf("Weeks: %d", r1);
    printf("Days: %d", r2);
}
