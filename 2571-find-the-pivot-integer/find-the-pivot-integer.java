class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;   // sum from 1 to n
        int root = (int) Math.sqrt(total);  // integer sqrt
        if (root * root == total) {
            return root;   // pivot integer found
        }
        return -1;  // no pivot integer
    }
}
