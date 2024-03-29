class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
         //main concept is that sum=sum+nums[i] less than nums[i] it is good to take sum=nums[i]
         for(int i=0;i<nums.length;i++){
          sum=Math.max(sum+nums[i],nums[i]);
          max=Math.max(sum,max);
         }

         return max;
    }
}