import java.util.*;

class Solution {
    public int secondHighest(String s) {
        Set<Integer> digits = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c - '0'); // convert char to int
            }
        }
        
        if (digits.size() < 2) return -1;
        
        // find the two largest
        int first = -1, second = -1;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d < first) {
                second = d;
            }
        }
        
        return second;
    }
}
