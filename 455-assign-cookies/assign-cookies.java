import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort children by greed
        Arrays.sort(s); // sort cookies by size

        int i = 0; // child index
        int j = 0; // cookie index

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // cookie can satisfy this child
                i++;
            }
            // move to the next cookie in either case
            j++;
        }
        return i; // number of satisfied children
    }
}
