import java.util.*;
class infix{
    public static void main(String[] args) {
        // String s="9-5+3*4/6";
        // String s="2+3/5-10*5*4";
        String s="2+3*5-3/3";
        System.out.println(infixx(s));
    }
    static int infixx(String s){
        Stack<Integer> sn=new Stack<>();
        Stack<Character> sc=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                sn.push(c-48);
            }
            else if(sc.size()==0){
                sc.push(c);
            }
            else{
                if(c=='+' || c=='-'){
                    int v2=sn.pop();
                    int v1=sn.pop();
                    if(sc.peek()=='+')       sn.push(v2+v1);
                    else if(sc.peek()=='-')  sn.push(v1-v2);
                }
                if(c=='*' || c=='/'){
                    int v2=sn.pop();
                    int v1=sn.pop();
                    if(sc.peek()=='*')       sn.push(v2*v1);
                    else if(sc.peek()=='/')  sn.push(v1/v2);
                }
                sc.pop();
                sc.push(c);
            }
        }
        while(sn.size()>1){
            int v1=sn.pop();
            int v2=sn.pop();

            if(sc.peek()=='*')       sn.push(v2*v1);
            else if(sc.peek()=='/')  sn.push(v2/v1);
            else if(sc.peek()=='-')  sn.push(v2-v1);
            else if(sc.peek()=='+')  sn.push(v2+v1);
            sc.pop();
        }
        return sn.peek();
    }
}