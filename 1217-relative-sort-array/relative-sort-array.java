class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer , Integer> freq = new HashMap<>();
        for(int num : arr1) {
            freq.put(num , freq.getOrDefault(num , 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for(int num : arr2) {
            if(freq.containsKey(num)) {
                int count = freq.get(num);
                for(int i = 0; i < count; i++) {
                    result.add(num);
                }
                freq.remove(num);
            }
        }
        List<Integer> leftover = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            for(int i = 0; i< count; i++) {
                leftover.add(num);
            }
        }

        Collections.sort(leftover);
        result.addAll(leftover);

        int[] ans = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;

    }
}