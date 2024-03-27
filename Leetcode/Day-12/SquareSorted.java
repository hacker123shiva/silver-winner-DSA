 

  class Main {
    public static void main(String []args){
        Solution ob=new Solution();
        ob.sortedSquares(new int[]{-4,-1,0,3,10});
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int []arr=new int[nums.length];


        int post=nums.length;
        for(int i=0;i<nums.length;i++){
          if(nums[i]>=0){
            System.out.println("first postive index: "+post);
            post=i;
            break;
          }
        }
int neg=post-1;
int i=0;
        while(neg>=0&&post<nums.length){
        int a=nums[neg]*nums[neg];
        int b=nums[post]*nums[post];

        if(a<b){
            System.out.println("Negative square: "+a);
            arr[i]=a;
            neg--;
        }
        else{
            System.out.println("Positive square: "+b);
            arr[i]=b;
            post++;
        }
        i++;
        }

        while(neg>=0){
            int a=nums[neg]*nums[neg];
            System.out.println("Negative square: "+a);
            arr[i]=a;
            neg--;
             i++;
        }
        while(post<nums.length){
            int b=nums[post]*nums[post];
          System.out.println("Positive square: "+b);
            arr[i]=b;
            post++;
            i++;
        }
        return arr;
    }
}


class BestSolution {
    public int[] sortedSquares(int[] nums) {
        int []arr=new int[nums.length];

        int srt=0;
        int end=nums.length-1;

        int cur=nums.length-1;

        while(srt<=end){
            int srtVal=nums[srt]*nums[srt];
            int endVal=nums[end]*nums[end];

            if(srtVal>=endVal){
                arr[cur]=srtVal;
                srt++;
            }else{
                arr[cur]=endVal;
                end--;
            }
            cur--;
        }
 return arr;
    }
}