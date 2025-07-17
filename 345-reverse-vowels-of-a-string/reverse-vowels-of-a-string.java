class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";           // All vowels (lowercase + uppercase)
        char[] chars = s.toCharArray();         // Convert the string to a char array
        int i = 0, j = chars.length - 1;        // Two pointers: start and end

        while (i < j) {
            // Move i forward until it points to a vowel
            while (i < j && vowels.indexOf(chars[i]) == -1) i++;

            // Move j backward until it points to a vowel
            while (i < j && vowels.indexOf(chars[j]) == -1) j--;

            // Swap the vowels at i and j
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            // Move pointers inward
            i++;
            j--;
        }

        return new String(chars); // Convert char array back to string and return
    }
}
