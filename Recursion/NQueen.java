import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        nQueen(chess, 0, "");
    }

    public static void nQueen(int[][] chess, int row, String qf) {

        if (row == chess.length) {
            System.out.println(qf);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                nQueen(chess, row + 1, qf + " " + row + "-" + col);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] chess, int row, int col) {
        // Check for conflicts in the column above
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }

        // Check for conflicts in the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // Check for conflicts in the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // If no conflicts are found, it's safe to place the queen at this position
        return true;
    }

}
