class Solution {
    public void moveZeroes(int[] nums) {
        int inspos=0;
        for(int num: nums){
            if(num!=0){
                nums[inspos++]=num;
            }
        }
        for(int i=inspos;i<nums.length;i++){
            nums[i]=0;
        }
    }
}