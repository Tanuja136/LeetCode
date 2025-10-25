class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder repeated = new StringBuilder(word);
        
        // keep checking while the repeated word exists in sequence
        while (sequence.contains(repeated.toString())) {
            k++;
            repeated.append(word); // add one more repetition
        }
        
        return k;
    }
}
