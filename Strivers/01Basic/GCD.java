 class Solution {
    public static int calcGCD(int n, int m){
        int max=(n>=m?n:m);
        int min=(n<=m?n:m);
           int val=1;
        while(val!=0){
            val=max%min;
            max=min;
            min=val;
        }

        return  max;
    }
}