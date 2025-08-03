class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> freq = new HashSet<>();
        for(int candy : candyType) {
            freq.add(candy);
        }

        int candyLength = candyType.length / 2;
        return Math.min(freq.size() , candyLength);
    }
}