/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sv = new HashMap<>();
        HashMap<Character, Integer> tv = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (sv.containsKey(s.charAt(i))) {
                sv.put(s.charAt(i), sv.get(s.charAt(i)) + 1);
            }
            else {
                sv.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (tv.containsKey(t.charAt(j))) {
                tv.put(t.charAt(j), tv.get(t.charAt(j)) + 1);
            }
            else {
                tv.put(t.charAt(j), 1);
                }
            }
        return sv.equals(tv);
    }
}

// Basically created 2 different hashmaps for string s and t. 
// Then checked if the key was the same from previous time. 
// If yes then add a +1 for the Value, otherwise just put the key with value 1 for starters.
// Finally compare both hashmaps with sv.equals(tv) and since the answer was in boolean I make the thing compare and return instantly. 
// Still not sure how to compare and extract certain characters but yea