class Solution {
    public int maxFreqSum(String s) {
        Map<Character , Integer> map = new HashMap<>();
        Set<Character> vowels = Set.of('a' , 'e' , 'i' , 'o' , 'u');

        for(char ch : s.toCharArray()) {
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        int maxVowel = 0;
        int maxConsonent = 0;

        for(Map.Entry<Character , Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if(vowels.contains(ch)) {
                maxVowel = Math.max(maxVowel , count);
            }
            else {
                maxConsonent = Math.max(maxConsonent , count);
            }
        }
        return maxVowel + maxConsonent;
    }
}