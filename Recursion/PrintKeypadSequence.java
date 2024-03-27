import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        String[] seq = new String[]{"?!","abc","def","ghi","jkl","mnop","qrst","uv","wxyz",".,"};

        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        ArrayList<String> rs = getKeypad(num, seq);
        System.out.println(rs);
    }

    public static ArrayList<String> getKeypad(String num, String[] seq) {
        if (num.length() == 0) {
            ArrayList<String> rs = new ArrayList<>();
            rs.add("");
            return rs; // Return the ArrayList containing an empty string
        }

        // high level thinking
        ArrayList<String> p = getKeypad(num.substring(1), seq);
        ArrayList<String> res = new ArrayList<>();

        String ls = seq[Integer.parseInt((num.charAt(0)) + "")];
        for (int i = 0; i < ls.length(); i++) {
            for (String s : p) {
                res.add(ls.charAt(i) + s);
            }
        }

        return res;
    }
}
