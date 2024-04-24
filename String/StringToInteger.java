class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0)
        return 0;

        long res=0;
        boolean neg=false;
        if(s.charAt(0)=='-'){
            neg=true;
        }else{
            neg=false;
        }

        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(ch>='0'&&ch<='9'){
            res=res*10+(ch-'0');
            System.out.println(res);
            if(!neg && res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(neg && -res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        } else if(i==0&&(ch=='-'||ch=='+')){

        }
        
        else{
            break;
        }
        

        }
       if(neg)
       return -(int)res;
       else
       return (int)res;
    }
}