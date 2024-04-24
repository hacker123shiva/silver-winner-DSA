 

import java.util.HashMap;


class Solution {
    
    public HashMap<Integer,Integer> hm=new HashMap<>();

    int sum=0;
    public int climbStairs(int n) {
        if(n==0){
          return 1;
        }
        if(n<0){
            return 0; 
        }

        if(hm.containsKey(n)){
            return hm.get(n);
        }
         
         int x=climbStairs(n-1);
         int y=climbStairs(n-2);
        
        hm.put(n,x+y);
         return x+y;
    }
}