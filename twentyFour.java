import java.lang.*;
import java.util.*;
public class twentyFour {
    public static void main(String args[]){
        System.out.println(isValid2("[(])"));
    }

    public static boolean isValid2(String s) {
         Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                    st.push(')');
                }
            else 
            if(s.charAt(i)=='{'){
                    st.push('}');
                }

            else if(s.charAt(i)=='['){
                    st.push(']');
                }
                else{
                    if(st.size()==0) return false;

                    if(st.peek()==s.charAt(i) ){
                        st.pop();
                    
                    }
                    else  return false;
            }     
        }
    return st.size()==0;
}


    public static boolean isValid(String s) {
         Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else{
                if(st.size()==0) return false;
               if(st.peek()=='(' ){
                  st.pop();
            }
        }     
    }
    return st.size()==0;
}
}