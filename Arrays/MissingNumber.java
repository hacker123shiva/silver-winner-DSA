 

class Solution {
    public int missingNumber(int[] nums) {
        int v=(nums.length+1)*nums.length/2;

        for(int i=0;i<nums.length;i++){
            v-=nums[i];
        }
        return v;
    }
}