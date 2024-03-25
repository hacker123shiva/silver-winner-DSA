import java.util.Scanner;

class Solution {
    public static int factorial(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;

        // high level thinking
        int fac = n * factorial(n - 1);
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = factorial(n);
        System.out.println(fac);
    }
}