class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length&&pos<nums.length&&neg<nums.length;){
            if(nums[pos]>=0&&nums[neg]<0){
                  res[i]=nums[pos];
                  res[i+1]=nums[neg];
                  pos++;
                  neg++;
                  i+=2;
            }else if(nums[pos]<0){
                pos++;
            }else if(nums[neg]>=0){
                neg++;
            }
        }

        return res;
    }
}