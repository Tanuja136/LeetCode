class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");  // divisible by both 3 and 5
            } else if (i % 3 == 0) {
                result.add("Fizz");      // divisible by 3
            } else if (i % 5 == 0) {
                result.add("Buzz");      // divisible by 5
            } else {
                result.add(String.valueOf(i)); // not divisible by 3 or 5
            }
        }

        return result;
    }
}