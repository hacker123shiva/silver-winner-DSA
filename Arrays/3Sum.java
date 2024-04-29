import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {
                if (map.containsKey(nums[j])) {
                    // Create a sorted list for the triplet
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], map.get(nums[j]), nums[j]));
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                } else {
                    map.put(-nums[i] - nums[j], nums[j]);
                }
            }
        }

        return new ArrayList<>(resultSet);
    }
}
