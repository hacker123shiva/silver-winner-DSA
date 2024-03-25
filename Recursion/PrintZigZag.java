import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zigzag(n);
    }

    public static void zigzag(int n) {
        if (n == 0)
            return;

        // high level thinking
        System.out.println("Pre " + n);
        zigzag(n - 1);
        System.out.println("In " + n);
        zigzag(n - 1);
        System.out.println("Post " + n);
    }
}
