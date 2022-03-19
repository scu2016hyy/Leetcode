package LeetCode;

import java.util.HashMap;

public class Leetcode387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Leetcode387 leetcode387 = new Leetcode387();
        System.out.println(leetcode387.firstUniqChar(""));
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random()*3));
        }
    }
}