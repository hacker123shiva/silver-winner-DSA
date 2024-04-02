public class Solution {
    public static int countDigits(int n){
    int count=0;
    int num=n;
    while(num!=0){
        int d=num%10;
        num/=10;
        if(d!=0&&n%d==0)
        count++;
    }

    return count;
}
}
