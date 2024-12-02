import java.util.*;
public class prefixToPostfix {
    public static void main(String[] args) {
        System.out.println(preToPost("-9/*+5346"));
    }
    static String preToPost(String s){
        Stack<String>val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                val.push(c+"");
            }
            else{
                String val1=val.pop();
                String val2=val.pop();
                val.push(val1+val2+c);

            }
        }
        return val.pop();
    }
}
