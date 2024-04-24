class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p1=0,p2=0;
        int max=0;
        for(;p1<nums.length&&p2<nums.length;p2++){
            if(nums[p2]==0){
                max=Math.max(max,p2-p1);
                p1=p2+1;
            }
        }
        max=Math.max(max,p2-p1);

        return max;
    }
}