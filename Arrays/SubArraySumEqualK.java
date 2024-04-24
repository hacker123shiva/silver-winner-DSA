import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
          
                if(hm.containsKey(sum-k))
                count+=hm.get(sum-k);

                   hm.put(sum,hm.getOrDefault(sum,0)+1);
                if(sum==k){
                    count++;
                }
               
        }

        return count;
    }
}