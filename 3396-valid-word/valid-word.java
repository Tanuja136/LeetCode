class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) {
            return false;
        }

        boolean isVowel = false;
        boolean isConsonent = false; 
        
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if(!Character.isLetterOrDigit(ch)) {
                return false;
            }
            else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                isVowel = true;
            }
            else if(Character.isLetter(ch)) {
                isConsonent = true;
            }
        }
        return isVowel && isConsonent;
    }
}