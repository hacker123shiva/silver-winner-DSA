import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
           if(hm.containsKey(nums2[i])){
            al.add(nums2[i]);
            hm.remove(nums2[i]);
           }
        }

        int []ret=new int[al.size()];
        int i=0;
        for(int x:al){
            ret[i]=x;
            i++;
        }

        return ret;
    }
}