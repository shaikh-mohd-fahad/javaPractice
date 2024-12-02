import java.util.*;
class infixTwo{
    public static void main(String[] args) {
        System.out.println(infix("9-(5+3)*4/6"));
    }

//infix expression calculation
static int infix(String s){
    Stack<Integer>val=new Stack<>();
    Stack<Character>op=new Stack<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c>='0' && c<='9'){
            val.push(c-48);
        }
        else if(op.isEmpty() || c=='('){
            op.push(c);
        }
        else if(c==')'){
            while (op.peek()!='(') { 
                int v2=val.pop();
                int v1=val.pop();
                if(op.peek()=='+') val.push(v1+v2);
                if(op.peek()=='-') val.push(v1-v2);
                if(op.peek()=='*') val.push(v1*v2);
                if(op.peek()=='/') val.push(v1/v2);
                op.pop();
            }
            op.pop();
        }
        else{
            if((c=='+' || c=='-') && (op.peek()=='+' || op.peek()=='-')){
                int v2=val.pop();
                int v1=val.pop();
                if(op.peek()=='+') val.push(v1+v2);
                if(op.peek()=='-') val.push(v1-v2);
                if(op.peek()=='*') val.push(v1*v2);
                if(op.peek()=='/') val.push(v1/v2);
                op.pop();
                op.push(c);
            }
            else if(op.peek()=='*' || op.peek()=='/'){
                int v2=val.pop();
                int v1=val.pop();
                if(op.peek()=='*') val.push(v1*v2);
                if(op.peek()=='/') val.push(v1/v2);
                op.pop();
                op.push(c);
            }
            else 
            op.push(c);
        }
        // System.out.println("val: "+val);
    }
    while (val.size()>1) { 
        int v2=val.pop();
        int v1=val.pop();
        if(op.peek()=='+') val.push(v1+v2);
        if(op.peek()=='-') val.push(v1-v2);
        if(op.peek()=='*') val.push(v1*v2);
        if(op.peek()=='/') val.push(v1/v2);
        op.pop();
    }
    return val.pop();
}
}