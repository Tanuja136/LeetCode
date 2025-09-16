import java.util.*;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) pq.offer(num);

        while (k-- > 0) {
            int smallest = pq.poll();
            pq.offer(-smallest);   // flip and reinsert
        }

        int sum = 0;
        for (int val : pq) sum += val;
        return sum;
    }
}
