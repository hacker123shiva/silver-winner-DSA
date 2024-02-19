public class Copy {
    public static void main(String []args){
        int []arr;
        arr=new int[5];
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        arr[3]=15;
        arr[4]=16;
    
        int []copy;
        copy=arr;
        copy[1]=1000;
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
/*
shallow copy
PS D:\DSA\Arrays\Day-1> java Copy
12
1000
14
15
16
 */

 