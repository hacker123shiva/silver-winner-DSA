import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int point1 = 0;
        int count = 0;
        int prevcount = 0;

        // here i work as second pointer
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hm.containsKey(ch)) {
                int cor = hm.get(ch);

                // update count with updating value
                if (prevcount < count)
                    prevcount = count;

                point1 = Math.max(point1, cor + 1);

                count = i - point1 + 1;

                // update in lookup table
                hm.put(ch, i);

            } else {
                hm.put(ch, i);
                count++;
            }

        }

        if (prevcount < count) {
            return count;
        } else {
            return prevcount;
        }
    }
}