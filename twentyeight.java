import  java.util.*;
public class twentyeight {
    public static void main(String args[]){
        System.out.println(fun("]({[]})"));
    }

static boolean fun(String s){
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        // System.out.println(st);
        if(c=='('){
            st.push(')');
        }
        else if(c=='{'){
            st.push('}');
        }
        else if(c=='['){
            st.push(']');
        }else{
        System.out.println(st);
        if(st.size()!=0 && st.peek()==c ){
            st.pop();
        }
        else 
        return false;
    }
    }
    if(st.size()==0)
        return true;
    return false;
}
}