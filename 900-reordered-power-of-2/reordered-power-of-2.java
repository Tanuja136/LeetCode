import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Precompute all power of 2 signatures
        Set<String> powerSignatures = new HashSet<>();
        for (int i = 0; i < 31; i++) { // 2^30 is max < 2^31
            int pow = 1 << i;
            powerSignatures.add(getSignature(pow));
        }
        
        // Get signature for n
        String signature = getSignature(n);
        
        // Check if it matches any power of 2
        return powerSignatures.contains(signature);
    }
    
    // Converts a number into its sorted digit string (signature)
    private String getSignature(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}
