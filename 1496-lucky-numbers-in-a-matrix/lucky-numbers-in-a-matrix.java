import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];        // Assume first element is the smallest
            int colIndex = 0;              // Save column index of min

            // Find the smallest number in the row
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if this min value is the biggest in its column
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > min) {
                    isLucky = false;
                    break;
                }
            }

            // If it's a lucky number, add to result list
            if (isLucky) {
                result.add(min);
            }
        }

        return result;
    }
}
