//  Convert a given amount in rupees into notes of ₹500, ₹200, ₹100, ₹50, ₹20, ₹10 and remaining amount using arithmetic operators. 


#include <stdio.h>

int main(){
     int fh, th, h, f, tw, t, o ;
     int a, e;
     
     printf("Enter An Amount: ");
     scanf("%d", &a);

    fh = a / 500; 
    th = (a % 500) / 200;
    h = ((a % 500) % 200) /100;
    f = (((a % 500) % 200) %100) / 50;
    tw = ((((a % 500) % 200) %100) % 50)/ 20;
    t = (((((a % 500) % 200) %100) % 50)% 20) / 10;
    o =(((((a % 500) % 200) %100) % 50)% 20) % 10;

    printf("The Amount Converted To Notes Will Be\n");
    printf("500: %d\n", fh);
    printf("200: %d\n", th);
    printf("100: %d\n", h);
    printf("50: %d\n", f);
    printf("20: %d\n", tw);
    printf("10: %d\n", t);
    printf("1: %d\n", o);
    
 }
 