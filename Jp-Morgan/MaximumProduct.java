//brute force O(n^3)
//some optimization O(n^2)

class Solution {
    public int maxProduct(int[] nums) {

 int prefix=1;
 int suffix=1;

 int maxval=Integer.MIN_VALUE;

 for(int i=0;i<nums.length;i++){


 prefix*=nums[i];
 suffix*=nums[nums.length-i-1];
maxval=Math.max(maxval,Math.max(prefix,suffix));

if(nums[i]==0){
    prefix=1;
}
 
if(nums[nums.length-i-1]==0){
    suffix=1;
}

 
 }      

 return maxval;

    }
}

/*
1.all positive
2.even negative and rest positive
3.odd negative and rest positive
4.include 0

Use the concept of prefix and suffix.
[2,-1,3,4]
maximum is value left of negative or right of negative in this case.
in case you get 0 reassign value of prefix and suffix as 1.
 */