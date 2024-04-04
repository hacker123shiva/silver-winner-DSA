import java.util.Scanner;

class Solution{
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      boolean board[][]=new boolean[n][n];
      solve(board,0,new boolean[n], new boolean[2*n-1],new boolean[2*n-1],"");
    }

    public static void solve(boolean [][]board, int row, boolean []cols, boolean []rdiag, boolean []ldiag, String asf){
        if(row==board.length){
            System.out.println(asf);
            return;
        }
        //high level thinking
        for(int col=0;col<board[0].length;col++){
            if(cols[col]==false&&rdiag[row+col]==false&& ldiag[row-col+board.length-1]==false){
                cols[col]=true;
                rdiag[row+col]=true;
                ldiag[row-col+board.length-1]=true;
                board[row][col]=true;
                solve(board,row+1,cols, rdiag, ldiag, asf+","+row+"-"+col);
                cols[col]=false;
                rdiag[row+col]=false;
                ldiag[row-col+board.length-1]=false;
                board[row][col]=false;
            }
        }
    }
}