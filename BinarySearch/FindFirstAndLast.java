class Solution {
    public int[] searchRange(int[] nums, int target) {
          int first=0;
           
int i=0;
          for(;i<nums.length;i++){
             if(first!=i){
                 if(nums[i]!=target){
                    return new int[]{first,i-1};
                 } 
             }else if(nums[i]!=target){
                first++;
             }
          }
          if(first !=i){
            return new int[]{first,i-1};
          }
          return new int[]{-1,-1};
    }
}