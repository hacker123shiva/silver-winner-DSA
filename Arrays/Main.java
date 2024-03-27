class Main{
    public static void main(String[] args){
       int []notes={1,2,5,10,20,50,100};
       int note=50;

       int pos=-1;
       for(int i=0;i<notes.length;i++){
    if(note==notes[i]){
        pos=i;
        break;
    }
       }

    int count[]=new int[7];
       int num=note-3;
       while(num!=0){
       count[pos-1]=num/notes[pos-1];
       num =num%notes[pos-1];
       pos=pos-1;

       }

       for(int i=0;i<count.length;i++){
        System.out.println(notes[i]+"->"+count[i]);
       }
 
    }
}