import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                count++;
                max=Math.max(max,count);
            }else if(nums[i]==nums[i-1]){
                
            }else{
                count=1;
            }

        }
        
        if(nums.length==0)
        return 0;

            return max;
    }
}