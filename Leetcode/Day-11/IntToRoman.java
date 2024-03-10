 
class Solution {
    public String intToRoman(int num) {
                int []values={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String []romans={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
       
        String roman="";
        for(int i=values.length-1;i>=0;i--){
            if(num/values[i]!=0){
              
                roman=roman+romans[i].repeat(num/values[i]);

            }
            num=num%values[i];
        }
return roman;
    }
}