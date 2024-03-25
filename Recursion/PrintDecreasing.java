import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        // base case
        if (n == 0)
            return;

        // high level thinking
        System.out.println(n);
        printDecreasing(n - 1);
    }

}
