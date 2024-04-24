import java.util.*;

 class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {
     
        int left=0;
        int right=0;
        int maxlen=0;
        int sum=a[left];
 

        while(right<a.length){
         
            while( (left<right)&&sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }

             right++;
         if(right<a.length)
          sum+=a[right];            
        }

        return maxlen;
       


    }
}


 

  class Solution2 {
    public static int longestSubarrayWithSumK(int[] a, long k) {
     
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            
            // If sum exactly equals k, the length of the subarray up to this point is i + 1
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            } 
            
            // If there is a subarray whose sum equals k, 
            // the length of the current subarray starting from that previous sum should be i - previous index
            if (hm.containsKey(sum - k)) {
                maxlen = Math.max(maxlen, i - hm.get(sum - k));
            }  
            
            // Store the index of the sum if not present
            if (!hm.containsKey(sum))
                hm.put(sum, i);
        }

        return maxlen;
    }
}
