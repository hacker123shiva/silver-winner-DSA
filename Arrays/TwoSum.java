import java.util.HashMap;

class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(hm.containsKey(nums[i])){
                return new int[]{hm.get(nums[i]),i};
            }else{
                hm.put(comp,i);
            }
        }
        return new int[]{-1,-1};
    
}
} 
  