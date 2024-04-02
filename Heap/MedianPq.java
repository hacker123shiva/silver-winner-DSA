import java.util.Comparator;
import java.util.PriorityQueue;

class MedianPriorityQueue{
    private PriorityQueue<Integer> left=new PriorityQueue<>(Comparator.reverseOrder());
    private PriorityQueue<Integer> right=new PriorityQueue<>( );
    
    public void add(int num){
        if(right.size()>0 && right.peek()<num){
             right.add(num);
        }else {
             left.add(num);
        }

        if(right.size()-left.size()==2){
            left.add(right.remove());
        }else if(left.size()-right.size()==2){
            right.add(left.remove());
        }
    }

    public int peek(){
        if(left.size()==0 && right.size()==0)
        {   System.out.println("underflow");
            return -1;
        }
       else if(right.size()>left.size()){
            return right.peek();
        }else{
            return left.peek();
        }
    }

    public int remove(){
        if(this.size()==0)
        {   System.out.println("underflow");
            return -1;
        }
       else if(right.size()>left.size()){
            return right.remove();
        }else{
            return left.remove();
        }
    } 

    public int size(){
        return left.size()+right.size();
    }
}