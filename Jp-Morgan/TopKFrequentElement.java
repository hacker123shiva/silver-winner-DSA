import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Create frequency map of elements
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // Create buckets to store elements with the same frequency
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // Populate the result array with the top k frequent elements
        int[] res = new int[k];
        int index = 0; // Initialize index to track position in res array
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    res[index++] = buckets[i].get(j); // Add elements from buckets to res
                    if (index == k) { // Stop if k elements have been added
                        return res;
                    }
                }
            }
        }

        return res; // Return res even if less than k elements are found
    }
}
