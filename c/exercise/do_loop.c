#include <stdio.h>

int main() {
    int n = 0;
    int s = 0;

    do{
        printf("This is a do check\n");
    }while(n>0);

    // Always execs the code once because condition applies at the end.
    // Then if it meets the condition it will function like a while loop unless out of condition.
    // Since we are here, here's a goto statement to fuck with.

    for(int i = 0; i < 4; i++) {
        for (int j = i + 1; j < 5; j++) {
            for (int k = i - 1; k > 0 && k < 5; k++) {
                printf("%d , %d , %d\n", i, j, k);
                if (j > 3) {goto end;}
            }
        }
    }
    end:
        printf("That sucks tbh...");

    // WAIT 
    // Maximal rectangle can be solved using int[][] matrix for colum checks. I can function as rows and j as colums
    // Then we check if both the numbers at i and j hmmmm. We gotta conclude each of the index points of one in each row and compare them to one below....
    // if it doesn't meet much we move on the second row and do the same with the one beforehand, There's prolly a fucking algo for this.
}