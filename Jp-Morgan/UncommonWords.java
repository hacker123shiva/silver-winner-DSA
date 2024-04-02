import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String,Integer> hm=new HashMap<>();
      String []words1=s1.split(" ");
      String []words2=s2.split(" ");
      
      Set<String> set=new HashSet<>();
      for(String str: words1){
        set.add(str);
      }
      
      Set<String> ls=new HashSet<>();
      for(String str: words2){
        if(!set.contains(str)){
            ls.add(str);
        }
      }
      
      set.clear();
      for(String str: words2){
         set.add(str);
      }

     for(String str: words1){
        if(!set.contains(str)){
            ls.add(str);
        }
      }
      


String []arr=new String[ls.size()];
int i=0;
for(String str: ls){
arr[i++]=str;
}


return arr;
    }
}


class Solution1 {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String,Integer> hm1=new HashMap<>();
      HashMap<String,Integer> hm2=new HashMap<>();
      String []words1=s1.split(" ");
      String []words2=s2.split(" ");
       
       for(String word: words1){
         hm1.put(word, hm1.getOrDefault(word, 0)+1);
       }

      for(String word: words2){
         hm2.put(word, hm2.getOrDefault(word, 0)+1);
       }
    HashSet<String> ls=new HashSet<>();
      for(String str: hm1.keySet()){
        if(!hm2.containsKey(str) && hm1.get(str)==1){
           ls.add(str);
        }
      }

       for(String str: hm2.keySet()){
        if(!hm1.containsKey(str)&&hm2.get(str)==1){
           ls.add(str);
        }
      }


    
       
       String []arr=new String[ls.size()];
       int i=0;
       for(String str: ls){
        arr[i++]=str;
       }

return arr;
    }
}


class Solution2 {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> m = new HashMap();

        for(String s : s1.split(" ")) {
            m.put(s, m.getOrDefault(s, 0)+1);
        }

        for(String s : s2.split(" ")) {
            m.put(s, m.getOrDefault(s, 0)+1);
        }

        List<String> res = new ArrayList();
        for(String s : m.keySet()) {
            if (m.get(s)==1) res.add(s);
        }

        String[] ans = new String[res.size()];
        for(int i=0;i<res.size();i++) ans[i] = res.get(i);
        return ans;
    }
}