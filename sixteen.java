import java.util.*;
public class sixteen{
    public static void main(String[] args) {
        System.out.println(nonRepeatChar("hellohello"));
     }
     static char nonRepeatChar(String s){
         HashMap<Character,Integer> h=new HashMap<>();
         for(int i=0;i<s.length();i++){
             if(h.containsKey(s.charAt(i)))
             h.put(s.charAt(i),h.get(s.charAt(i))+1);
             else
             h.put(s.charAt(i),1);
         }
        for(var e:h.entrySet()){
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
         return '\0';
     }
}