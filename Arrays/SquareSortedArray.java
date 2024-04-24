
class Solution {
    public int[] sortedSquares(int[] nums) {
        int mid=0;
        int res[]=new int[nums.length];
        
    for(int i=0;i<nums.length;i++){
        if(nums[i]>=0){
         mid=i;
        //  System.out.println(mid);
         break;
        }
        if(i==nums.length-1){
            mid=nums.length;
        }
    }
     int left=mid-1;
     int right=mid;
     int i=0;
    while(left>=0&&right<nums.length){
        int l=nums[left]*nums[left];
        int r=nums[right]*nums[right];
        if(l<=r){
            res[i]=l;
            left--;
        }else  {
            res[i]=r;
            right++;
        }
        i++;
    }

    while(left>=0){
  res[i]=nums[left]*nums[left];
            left--;
            i++;
    }

    while(right<nums.length){
    res[i]=nums[right]*nums[right];
            right++;
            i++;
    }

    return res;
    }
}