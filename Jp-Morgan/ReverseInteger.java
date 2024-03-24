class Solution {
    public int reverse(int x) {

        StringBuilder sb = new StringBuilder(Long.toString((long) x >= 0 ? (long) x : -(long) x));
        long val = Long.parseLong(sb.reverse().toString());
        System.out.println(val);
        return (val > Integer.MAX_VALUE) ? 0 : x >= 0 ? (int) val : -(int) val;
    }
}

class Solution2 {
    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            reversed *= 10;
            reversed += x % 10;

            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
                return 0;
            ;
        }
        return (int) reversed;
    }

}