import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int [][]arr=matrix;
        List<Integer> ls=new ArrayList<>();
       int el=0;
       int dir=0;
              int left=0;
             int right=matrix[0].length-1;
             int top=0;
             int bottom=matrix.length-1;
        while(el<matrix.length*matrix[0].length){
             dir%=4;
         
            if(dir==0){
              for(int i=left;i<=right;i++){
               ls.add(arr[top][i]);
               el++;
              }
                top++;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++){
                 ls.add(arr[i][right]);
                 el++;
                }
                 right--;
            }else if(dir==2){
             for(int i=right;i>=left;i--){
                ls.add(arr[bottom][i]);
                el++;
               }
                 bottom--;
            }else{
           for(int i=bottom;i>=top;i--){
                ls.add(arr[i][left]);
                el++;
              }
               left++;
            }
            dir++;
        }

        return ls;
    }
}