import java.util.Scanner;

class Solution {
    public static int powerN(int base, int n) {
        // base case
        if (n == 0)
            return 1;

        // high level thinking
        int pow = base * powerN(base, n - 1);
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for base:");
        int base = sc.nextInt();

        System.out.println("Enter value of power for base:");
        int n = sc.nextInt();
        int pow = powerN(base, n);
        System.out.println("Power of " + base + " to " + n + " is " + pow);
    }
}