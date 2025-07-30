class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd  = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                even.add(nums[i]);
            }
            else {
                odd.add(nums[i]);
            }
        }

        even.addAll(odd);

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = even.get(i);
        }
        return res;
    }
}