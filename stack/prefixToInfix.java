import java.util.*;
public class prefixToInfix {
    public static void main(String[] args) {
        System.out.println(preToInfix("-9/*+5346"));
    }
    static String preToInfix(String s){
        Stack<String>val=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                val.push(c+"");
            }
            else{
                String val1=val.pop();
                String val2=val.pop();
                val.push("("+val1+c+val2+")");
            }
        }
        return val.pop();
    }
}
