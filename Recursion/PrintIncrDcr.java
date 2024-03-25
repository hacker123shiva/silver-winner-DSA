import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printIncDcr(n);
    }

    public static void printIncDcr(int n) {
        if (n == 0)
            return;

        // high level thinking
        System.out.println(n);
        printIncDcr(n - 1);
        System.out.println(n);
    }
}