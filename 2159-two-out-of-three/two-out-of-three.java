class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        for(int num : nums3) set3.add(num);

        Map<Integer , Integer> count = new HashMap<>();
        for(int num : set1) count.put(num , count.getOrDefault(num , 0) + 1);
        for(int num : set2) count.put(num , count.getOrDefault(num , 0) + 1);
        for(int num : set3) count.put(num , count.getOrDefault(num , 0) + 1);

        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry :count.entrySet()) {
            if(entry.getValue() >= 2) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}