class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;

        for(String s : sentences) {
            String[] words = s.split(" ");
            int count = words.length;

            if(count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}