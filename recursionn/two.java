package recursionn;
import java.util.*;
class two {
    
    public static void main(String[] args) {
        int a[]={3,1,2};
        ArrayList<Integer> list=new ArrayList<>();
        arrSeq(a, 0, list);
    }
    static void revArr(int a[],int s,int e){
        if(s>=e)
        {
            return;
        }
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        revArr(a, s+1, e-1);
    }
    
    
    static void arrSeq(int a[],int i,ArrayList<Integer> list){
        if(i==a.length){
            System.out.println(list);
            return;
        }
        list.add(a[i]);
        arrSeq(a,i+1,list);
        list.remove(list.size() - 1);
        arrSeq(a,i+1,list);
    }

    //All sub sequence of string
    void subSeq(String s,int i){
        
    }

}
