class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> r = new HashSet<>();

        for(int i : nums1) {
            s.add(i);
        }

        for(int i : nums2) {
            if(s.contains(i)) {
                r.add(i);
            }
        }

        int[] arr = new int[r.size()];
        int i = 0;
        for(int k : r) {
            arr[i++] = k;
        }
        return arr;
    }
}