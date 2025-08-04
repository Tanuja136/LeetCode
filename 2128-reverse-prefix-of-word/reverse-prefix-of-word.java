class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int index1 = word.indexOf(ch);

        if (index1 == -1) return word;

        for(int i = 0; i <= index1; i++) {
            stack.push(word.charAt(i));
        }

        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        for(int i = index1+1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}