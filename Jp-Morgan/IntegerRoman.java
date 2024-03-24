class Solution {
    public String intToRoman(int num) {
        int nums[] = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String str[] = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        StringBuilder sb = new StringBuilder("");
        for (int i = nums.length - 1; i >= 0 && num != 0; i--) {
            int qu = num / nums[i];
            if (qu != 0) {
                for (int j = 1; j <= qu; j++)
                    sb.append(str[i]);
            }

            num %= nums[i];
        }

        return sb.toString();

    }
}