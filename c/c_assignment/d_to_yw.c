// Convert a given number of days into years, weeks, and remaining days. 

#include <stdio.h>

int main() {
    int days, year, weeks, remaining_days_year, remaining_days_week;

    printf("Enter The Number Days: ");
    scanf("%d", &days);

    year = days / 365;
    weeks = days / 7;

    remaining_days_year = days % 365;
    remaining_days_week = days % 7;

    printf("The Number Of Years With %d days would be: %d years with %d days remaning\n", days, year, remaining_days_year);
    printf("The Number Of Weeks With %d days would be: %d weeks with %d days remaning\n", days, weeks, remaining_days_week);
    
}
