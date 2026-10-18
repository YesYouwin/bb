package com.buresu.codes;

public class palindrome {
    public static boolean check(String word) {
        String reversed = new StringBuilder(word).reverse().toString();

        return word.equalsIgnoreCase(reversed);
    }
}