import java.util.HashMap;
//max freq of element in array
public class seven{
    public static void main(String args[]){
        int a[]={1,3,5,4,1,5,4,6,1,1};
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else{
                h.put(a[i],1);
            }
        }
        System.out.println(h.entrySet());
    }
}