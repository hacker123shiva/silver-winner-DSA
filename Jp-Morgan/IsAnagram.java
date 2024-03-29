import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
    hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
    hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }

if(hm1.equals(hm2)){
    return true;
}else{
    return false;
}
    }
}