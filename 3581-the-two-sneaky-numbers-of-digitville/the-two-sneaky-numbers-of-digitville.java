class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer , Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : freq.entrySet()) {
            if(entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }
        return new int[]{result.get(0),  result.get(1)};
    }
}