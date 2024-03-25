import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {

        // base case
        if (n == 0)
            return;

        // high level thinking
        printIncreasing(n - 1);
        System.out.println(n);
    }
}