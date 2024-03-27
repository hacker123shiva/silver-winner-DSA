class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=1;i<=k;i++){
            int tmp=nums[0];
            for(int j=1;j<nums.length;j++){
           int x=nums[j];
           nums[j]=tmp;
           tmp=x;
            }
            nums[0]=tmp;
           
        }
    }
}

class NSolution {
    public void rotate(int[] nums, int k) {
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]=nums[i];
           
        }
   for(int i=0;i<nums.length;i++){
    nums[i]=arr[i];
   }
     
    }
}
