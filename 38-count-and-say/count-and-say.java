class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        
        String result = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char[] chars = result.toCharArray();
            
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] == chars[j - 1]) {
                    count++;
                } else {
                    sb.append(count).append(chars[j - 1]);
                    count = 1;
                }
            }
            sb.append(count).append(chars[chars.length - 1]); // append last run
            result = sb.toString();
        }
        
        return result;
    }
}