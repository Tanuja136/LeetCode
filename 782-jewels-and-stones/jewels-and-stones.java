class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelset = new HashSet<>();
        for(char j : jewels.toCharArray()) {
            jewelset.add(j);
        }

        int count = 0;
        for(char s : stones.toCharArray()) {
            if(jewelset.contains(s)) {
                count++;
            }
        }
        return count;
    }
}