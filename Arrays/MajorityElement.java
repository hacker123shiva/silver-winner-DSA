class Solution {
    public int majorityElement(int[] nums) {
      int count=0;
      int majority=-1;
      for(int i=0;i<nums.length;i++){
        if(count==0){
            majority=nums[i];
            count++;
        }else if(majority!=nums[i]){
            count--;
        }else{
            count++;
        }
      }

      if(count>0){
        count=0;
        for(int i=0;i<nums.length;i++){
           if(majority==nums[i]){
            count++;
           }
        }
      }
      if(count>nums.length/2)
      return majority;
      else
      return -1;
    }
}