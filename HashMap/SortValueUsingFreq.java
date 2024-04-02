import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution{
    public static void main(String []args){
        int []arr=new int[]{2,2,2,2,0,0,0,1,1,3,1,5,5,4,4,3};
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       
        Integer arrw[]= new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            arrw[i]=arr[i];
        }

        Arrays.sort(arrw,new SortFreq(hm));

        System.out.println(Arrays.toString(arrw));


    }

    static class SortFreq implements Comparator<Integer>{
       
        HashMap<Integer,Integer> fm;

        SortFreq(HashMap<Integer,Integer> fm){
            this.fm=fm;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
             
            int valfreq=fm.get(o1).compareTo(fm.get(o2));

            int value=o1.compareTo(o2);

            if(valfreq==0)
            return value;
            else
            return valfreq;
        }

    }
 }