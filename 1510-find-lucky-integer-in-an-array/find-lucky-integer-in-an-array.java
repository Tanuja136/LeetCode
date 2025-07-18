class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> FreqCount = new HashMap<>();
        for(int num : arr) {
            FreqCount.put(num , FreqCount.getOrDefault(num , 0) + 1);
        }

        int maxLucky = -1;
        for(int num : arr) {
            if(FreqCount.get(num) == num) {
                maxLucky = Math.max(maxLucky , num);
            }
        }
        return maxLucky;
    }
}