#include <stdio.h>

int main() {
    int nums[4];
    int i = 0;

    printf("Enter 4 Different Numbers: ");
    scanf("%d%*[, ]%d%*[, ]%d%*[, ]%d", &nums[0], &nums[1], &nums[2], &nums[3]);

    while (i < sizeof(nums) / sizeof(nums[0])) {
        if (i == 0) {
            printf("{%d,", nums[i]);
        }
        else if (i == 3) {
            printf(" %d}", nums[i]);
        }
        else {
            printf(" %d,", nums[i]);
        }
        i++; 
    }
}
