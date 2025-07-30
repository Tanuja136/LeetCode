import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max Heap using reverse order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to the heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Process until one or no stones are left
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll(); // heaviest
            int stone2 = maxHeap.poll(); // second heaviest

            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
