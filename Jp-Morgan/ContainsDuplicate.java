import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashMap<Integer,Integer> hm=new HashMap<>();

         for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                   return true;
            }else{
                hm.put(nums[i],i);
            }
         }

         return false;
    }
}


//using hashset datastructure
class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> isSet=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(isSet.contains(nums[i])){
                return true;
            }
            else{
                isSet.add(nums[i]);
            }
        }
return false;
    }
}
