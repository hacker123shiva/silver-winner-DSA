import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        
   int idx=-1;
   //find index
   for(int i=nums.length-2;i>=0;i--){
     if(nums[i]<nums[i+1]){
        idx=i;
        break;
     }
   }
  //find minimum next greatest element to  arr[idx] and swap
   for(int i=nums.length-1;i>=0;i--){
      if(idx!=-1&& nums[idx]<nums[i]){
        int tmp=nums[idx];
        nums[idx]=nums[i];
        nums[i]=tmp;
        break;
      }
   }

Arrays.sort(nums,idx+1,nums.length);
System.out.println(Arrays.toString(nums));
    }

   
}