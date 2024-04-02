import java.util.*;

 class Main {
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int td=countdigit(n);
      
	   if(n==countsum(n))
	   System.out.println(true);
	   else
	   System.out.println(false);


	}

	public static int countdigit(int n){
		int count=0;
		while(n!=0){
        n/=10;
        count++;
		}
		return count;
	}

		public static int countsum(int n ){
		int digit=countdigit(n);
		int val=0;
		while(n!=0){
			val=val+ power(n%10,digit); 
            n/=10;
		}
		return val;
	}

	public static int power(int num,int pow){
		if(pow==0)
		return 1;

		return num*power(num,pow-1);
	}
}
