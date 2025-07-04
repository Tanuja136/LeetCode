class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();  // keys(sorted word) , list is anagrams

        for(String word : strs) {   //taking the words
            char[] chars = word.toCharArray(); // converting the string to characters
            Arrays.sort(chars); //sort the chars
            String sorted = new String(chars); //converting back to string

            map.putIfAbsent(sorted , new ArrayList<>());
            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}