class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }

        for(int num : nums2) {
            set2.add(num);
        }

        int ans1 = 0;
        for(int nums : nums2) {
            if(set1.contains(nums)) {
                ans1++;
            }
        }
        int ans2 = 0;
        for(int nums : nums1) {
            if(set2.contains(nums)) {
                ans2++;
            }
        }

        return new int[]{ans2 , ans1};

    }
}