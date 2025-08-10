class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Shift to 0-based index
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            result.insert(0, letter); // Prepend letter
            columnNumber /= 26;
        }

        return result.toString();
    }
}
