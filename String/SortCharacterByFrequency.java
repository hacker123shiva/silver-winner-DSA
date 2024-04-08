import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
      

       Map<Character, Integer> frMap=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        frMap.put(ch,frMap.getOrDefault(ch,0)+1);
       }
        List<Character> ls=new ArrayList<>(frMap.keySet());
        
        Collections.sort(ls,new Comparator<Character>(){
            public int compare(Character ch1,Character ch2){
                int first=frMap.get(ch1);
                int second=frMap.get(ch2);

                if(first!=second){
                    return -(first-second);
                }else{
                    return ch1-ch2;
                }
            }
        });

StringBuilder sb=new StringBuilder();
        for(char ch: ls){
            int fr=frMap.get(ch);
            for(int i=0;i<fr;i++){
            sb.append(ch);
            }
        }

        return sb.toString();
    }
}