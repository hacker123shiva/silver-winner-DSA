import java.util.*;
 class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int arr[]=new int[n];

		int val=fibMemo(n-1,arr);
		// int val=fib(n-1);
		System.out.println(val);
	}

  public static int fib(int n){
	  if(n==0||n==1)
	  return 1;


	  return fib(n-1)+fib(n-2);
  }

   public static int fibMemo(int n, int []arr){
	   if(n==0||n==1){
		   return 1;
	   }
	    
	if(arr[n]!=0){
		return arr[n];
   }

    int val=fibMemo(n-1,arr)+fibMemo(n-2,arr);
	arr[n]=val;
	return val;
   }
}
