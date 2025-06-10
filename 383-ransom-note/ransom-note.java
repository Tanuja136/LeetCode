class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]f = new int[26];
        Arrays.fill(f,0);
        for(char ch: magazine.toCharArray()){
            f[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            f[ch-'a']--;
            if (f[ch - 'a'] < 0) {
                return false; 
            }
        }

        return true;
    }
}