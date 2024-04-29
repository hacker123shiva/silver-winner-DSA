class Solution {
    public int searchInsert(int[] nums, int target) {
         int left=0;
        int right=nums.length-1;
        
       
        while(left<=right){
         int mid=left+(right-left)/2;
          if(nums[mid]==target){
            return mid;
          }else if(nums[mid]>target){
            if(mid==0)
            return 0;

            if(nums[mid-1]<target)
            return mid;

            else
            right=mid-1;
          }else{
            if(mid==nums.length-1)
            return mid+1;

            if(nums[mid+1]>target)
            return mid+1;
            else
            left=mid+1;
          }
        }

        return -1;
    }
}