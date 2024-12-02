import java.util.*;
public class postfixToInfix {

    public static void main(String[] args) {
        System.out.println(postToInfix("953+4*6/-"));
    }
    static String postToInfix(String s){
        Stack<String>val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                val.push(c+"");
            }
            else{
                String val2=val.pop();
                String val1=val.pop();
                val.push("("+val1+c+val2+")");

            }
        }
        return val.pop();
    }


}
