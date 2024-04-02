//  create Pair class provide such they implement comparable and provide code ti compare to pair object 
 
class Pair implements Comparable<Pair>{
    int key;
    int value;
    
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }

    @Override
    public int compareTo(Pair o) {
        if(this.value==o.value){
            return this.key-o.key;
        }
        return o.value-this.value;
    }

    @Override
    public String toString() {
        return "Pair [key=" + key + ", value=" + value + "]";
    }

}


class Solution{
    public static void main(String []args){
        Pair pair1 = new Pair(1,2);
        Pair pair2 = new Pair(2,2);

        System.out.println(pair1.compareTo(pair2));
    }
}


