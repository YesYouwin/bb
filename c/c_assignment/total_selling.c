// Calculate the total cost and selling price of an item when its cost price, quantity, and profit percentage are given.

#include <stdio.h>

int main() {
    int cost_price, quantity, profit_percentage; 
    float total_cost, selling_price, profit;

    printf("Enter The Cost Price Of The Item: ");
    scanf("%d", &cost_price);
    printf("Enter The Quantity Of The Item: ");
    scanf("%d", &quantity);
    printf("Enter The Profit Percentage For The Item: ");
    scanf("%d", &profit_percentage);

    total_cost = cost_price * quantity;
    profit = (total_cost * profit_percentage) /100;
    selling_price = total_cost + profit;

    printf("The Total Cost Of The Item Is: %.2f\n", total_cost);
    printf("The Selling Price Of The Item Is: %.2f\n", selling_price);
}