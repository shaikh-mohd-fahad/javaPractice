import java.util.*;
//hashmap practice
class nine{
    public static void main(String[] args) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,10);
        h.put(1,30);
        h.put(2,40);
        System.out.println(h);
        System.out.println(h.get(0));
        System.out.println(h.values());
        System.out.println(h.keySet()); 
        System.out.println(h.entrySet()); 
        for(var e:h.entrySet()){
            System.out.println(e.getValue());
        }
    }
}