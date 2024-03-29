import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //here is main concept use hashmap as key 
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bighm=new HashMap<>();
        List<List<String>> ls=new ArrayList<>();
        for(String str: strs){
         HashMap<Character,Integer> hm=new HashMap<>();
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
         }

         if(bighm.containsKey(hm)){
            ArrayList<String> al=bighm.get(hm);
            al.add(str);
            bighm.put(hm,al);
         }else{
            ArrayList<String> al=new ArrayList<>();
            al.add(str);
            bighm.put(hm,al);
         }
        }

        for(ArrayList<String> al: bighm.values()){
      ls.add(al);
        }
        return ls;
    }
}


class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        return sortAndMap(strs);
    }

    public List<List<String>> sortAndMap(String[] strs){
        Map<String, List<String>> dict = new HashMap<>();

        for(String s : strs){
            //here main learning is convert string into character of arrays usting toCharArray
            char[] sortedArr = s.toCharArray();
            Arrays.sort(sortedArr);
            String sorted = new String(sortedArr);
            List<String> values = dict.getOrDefault(sorted, new ArrayList<String>());
            values.add(s);
            dict.put(sorted, values);
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> values : dict.values()){
            result.add(values);
        }

        return result;
    }
}