import java.util.*;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-", ".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray()) {
                code.append(morse[c - 'a']); // map 'a' to 0, 'b' to 1, etc.
            }
            set.add(code.toString());
        }
        
        return set.size();
    }
}
