/*
9. Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        int res = 0;
        int num = x;
        while (num != 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return (x == res);
    }
}

