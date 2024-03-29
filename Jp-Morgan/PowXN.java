class Solution {


    public static void main(String []args){
    double val=myPow(2.00,10);
    System.out.println(val);
    }
    public static double myPow(double x, int n) {
        if(n==0)
        return (double)1;

        //high level thinking
       double val= x*myPow(x,n-1);
       return val;

    }
}


class Solution2 {
    public double myPow(double x, int n) {
        long num=n;
        if (num == 0)
            return 1.0;
     
        if (num < 0) {
       

            x = 1 / x;
            num = -num;
        }
        
        double result = 1.0;

        //two interesting fact 
        // first we are using divide power by 2 every time and resultant value multipl by itself and new value stored.
        //second in case of Integer.MIN_VALUE when convert into positive it can become out of range so we take long instead of int
        while (num > 0) {
            if (num % 2 == 1)
                result *= x;
            x *= x;
            num /= 2;
        }
        
        return result;
    }
}
