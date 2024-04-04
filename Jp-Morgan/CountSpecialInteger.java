import java.util.HashMap;

class Solution {
    public int countSpecialNumbers(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            HashMap<Integer, Integer> hm=new HashMap<>();
            boolean flag=true;
            int num=i;
            while(num!=0){
            if(hm.containsKey(num%10)){
                flag=false;
                break;
            }else{
                hm.put(num%10,1);
                num/=10;
            }
            }
            if(flag)
            count++;
        }

        return count;
    }
}