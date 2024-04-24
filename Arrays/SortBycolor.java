import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        

        //use insertion sort 
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j+1]<nums[j]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }else{
                    break;
                }
            }
        }
 System.out.println(Arrays.toString(nums));

 //we need to optimize
    }
}


class Solution2{
    public static void sortColors(int []nums){
    
     
    int left=0;
    int mid=0;
    int high=nums.length-1;

    while(mid<=high){
        if(nums[mid]==0){
            int tmp=nums[left];
            nums[left]=nums[mid];
            nums[mid]=tmp;
            left++;
            mid++;
        }else if(nums[mid]==1){
           
            mid++;
        }else{
            int tmp=nums[high];
            nums[high]=nums[mid];
            nums[mid]=tmp;
            high--;
        }
    }

    System.out.println(Arrays.toString(nums));
    }

    public static void main(String []args){
        int nums[]={0,2,1,0,1,2,2,1,0,0,1};
        sortColors(nums);
    }
}