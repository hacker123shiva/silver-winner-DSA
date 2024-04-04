import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int row=sc.nextInt();
     int col=sc.nextInt();

     int chess[][]=new int[n][n];
     recursion(chess, row, col, 1);
    }

    public static void recursion(int [][]chess, int row, int col, int move){
       if(row>=chess.length ||col >=chess.length ||row<0 ||col<0||chess[row][col]!=0)
       return ;

       if(move==chess.length*chess.length){
        chess[row][col]=move;
        display(chess);
        chess[row][col]=0;
        return;
       }
        
        //high level thinking
        chess[row][col]=move;
        recursion(chess, row-2,col-1,move+1);
        recursion(chess, row-1,col-2,move+1);
        recursion(chess, row-2,col+1,move+1);
        recursion(chess, row-1,col+2,move+1);
        recursion(chess, row+2,col-1,move+1);
        recursion(chess, row+1,col-2,move+1);
        recursion(chess, row+2,col+1,move+1);
        recursion(chess, row+1,col+2,move+1);
        chess[row][col]=0;

    }

    public static void display(int  [][]matrix){
        System.out.println(Arrays.deepToString(matrix));
    }
}