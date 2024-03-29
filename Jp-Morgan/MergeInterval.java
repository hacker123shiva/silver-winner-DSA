import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        int arr[][]=new int[1][2];
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<Integer []> ls=new ArrayList<>();
        arr[0][0]=intervals[0][0];
        arr[0][1]=intervals[0][1];
        if(intervals.length==1){
        
            return intervals;
        }
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=arr[0][1]){
            arr[0][1]=intervals[i][1]>arr[0][1]?intervals[i][1]:arr[0][1];
            if(i==intervals.length-1){
                ls.add(new Integer[]{arr[0][0],arr[0][1]});
            }
            }
            else{

                ls.add(new Integer[]{arr[0][0],arr[0][1]});
                arr[0][0]=intervals[i][0];
                arr[0][1]=intervals[i][1];
                   if(i==intervals.length-1){
                ls.add(new Integer[]{intervals[i][0],intervals[i][1]});
            }
            }
        }
        arr=new int[ls.size()][2];
        for(int i=0;i<ls.size();i++){
        arr[i][0]=ls.get(i)[0];
        arr[i][1]= ls.get(i)[1];
        }

        return arr; // Replace this with your merged intervals
    }
}