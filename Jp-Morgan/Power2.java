class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Non-positive numbers cannot be powers of two
        }
        
        while (n > 1) {
            if (n % 2 != 0) {
                return false; // If there is any remainder when dividing by 2, it's not a power of two
            }
            n /= 2; // Divide by 2 until n becomes 1 or not divisible by 2
        }
        
        return true; // If n reaches 1, it's a power of two
    }
}
