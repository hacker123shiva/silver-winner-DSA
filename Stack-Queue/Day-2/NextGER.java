

public class NextGER {
    public static int nger(int num, int []arr){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                for(int j=i+1;j<arr.length;j++){
                    if(num<arr[j])
                    return arr[j];
                }
                return -1;
            }
            else{
                //next pass
            }
        }
        return -1;     
    }


    public static void main(String []args){

        int arr[]={2,5,9,3,1,12,6,8,7};
        System.out.println("2: "+nger(2,arr));
        System.out.println("5: "+nger(5,arr));
        System.out.println("9: "+nger(9,arr));
        System.out.println("3: "+nger(3,arr));
        System.out.println("12: "+nger(12,arr));
    }
}

/*
 first approach 
[2,5,3,1,12,6,8,7]
3->
 for(){

    if(x==3)
    for(){

    }
    else 
    continue
 }

 Time complexity : O(n)
 */