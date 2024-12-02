import java.util.*;

public class postfix {

    public static void main(String[] args) {
        System.out.println(postfixEvol("953+4*6/-"));
    }
    //postfix calculation.
    static int postfixEvol(String s){
        Stack<Integer>val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                val.push(c-48);
            }else{
                int v2=val.pop();
                int v1=val.pop();
                if(c=='+') val.push(v1+v2);
                if(c=='-') val.push(v1-v2);
                if(c=='*') val.push(v1*v2);
                if(c=='/') val.push(v1/v2);
            }
        }
        return val.pop();
    }

    //convert infix expression to postfix expression
    static String postfixx(String s){
        Stack<String>val=new Stack<>();

        Stack<Character>op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                val.push(c+"");
            }
            else if(op.isEmpty() || c=='('){
                op.push(c);
            }
            else if(c==')'){
                while (op.peek()!='(') { 
                    char d=op.pop();
                    String v2=val.pop();
                    String v1=val.pop();
                    val.push(v1+v2+d);
                }
                op.pop();
            }
            else{
                if((c=='+' || c=='-') && (op.peek()=='+' || op.peek()=='-')){
                    String v2=val.pop();
                    String v1=val.pop();
                    char d=op.pop();
                    val.push(v1+v2+d);
                    op.push(c);
                }
                else if(op.peek()=='*' || op.peek()=='/'){
                    char d=op.pop();
                    String v2=val.pop();
                    String v1=val.pop();
                    val.push(v1+v2+d);
                    op.push(c);
                }
                else 
                op.push(c);
            }
        }
        while (val.size()>1) { 
            char d=op.pop();
            String v2=val.pop();
            String v1=val.pop();
            val.push(v1+v2+d);
        }
        return val.pop();
    }
}
