class Solution {
    //brute force
    public int maxProfit(int[] prices) {
        
        int maxPf=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>=prices[i])
                {
                    maxPf=Math.max(maxPf,prices[j]-prices[i]);
                }
            }
        }
        return maxPf;
    }
}

class Solution2{
    //optimize solution with O(n) tc and O(1) sc
      public int maxProfit(int[] prices) {
          
         int minsf=Integer.MAX_VALUE;
         int maxval=Integer.MIN_VALUE;
          for(int i=0;i<prices.length;i++){
               if(minsf>prices[i])
               minsf=prices[i];
               maxval=Math.max(maxval,prices[i]-minsf);
          }
          return maxval;
      }
  }

  class Solution3 {
    //using auxulary array creating max for given element
      public int maxProfit(int[] prices) {
          
         int aux[]=new int[prices.length];
         int maxval=0;
          for(int i=prices.length-1;i>=0;i--){
              if(prices[i]>=maxval)
              maxval=prices[i];
  
              aux[i]=maxval;
          }
          maxval=0;
          for(int i=0;i<prices.length;i++){
              maxval=Math.max(maxval,aux[i]-prices[i]);
          }
          return maxval;
      }
  }