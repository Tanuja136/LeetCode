class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> uniqueNumbers = new HashSet<>();
        int i = 0, n = word.length();
        
        while (i < n) {
            // Skip non-digit characters
            if (!Character.isDigit(word.charAt(i))) {
                i++;
                continue;
            }

            // Start of a number
            int start = i;
            while (i < n && Character.isDigit(word.charAt(i))) {
                i++;
            }

            // Extract number and strip leading zeros
            String number = word.substring(start, i).replaceFirst("^0+", "");
            if (number.equals("")) {
                number = "0"; // if the number was all zeros
            }

            uniqueNumbers.add(number);
        }

        return uniqueNumbers.size();
    }
}