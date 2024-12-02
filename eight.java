
import java.util.HashMap;

class eight{
    public static void main(String[] args) {
        String s1="siletn",s2="listen";
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            if(h1.containsKey(s1.charAt(i))){
                h1.put(s1.charAt(i),h1.get(s1.charAt(i))+1);
            }
            else
            h1.put(s1.charAt(i),1);
        }
        for(int i=0;i<s2.length();i++){
            if(h2.containsKey(s2.charAt(i))){
                h2.put(s2.charAt(i),h2.get(s2.charAt(i))+1);
            }
            else
            h2.put(s2.charAt(i),1);
        }
        System.out.println(h1.entrySet());
        System.out.println(h2.entrySet());
        System.out.println(h2.get('s'));
        System.out.println(h1.equals(h2));
    }
}