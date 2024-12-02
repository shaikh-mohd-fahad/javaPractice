import java.util.*;
public class twentysix {
    public static void main(String args[]){
        int n[]={5,2,4,6,3,5};
        int a[]=nextSmallerEl(n);
        System.out.println(Arrays.toString(a));
    }
    static int[] nextGreterEl(int n[]){
        Stack<Integer> s=new Stack<>();
        int size=n.length-1;
        s.push(n[size]);
        n[size]=-1;
        for(int i=size-1;i>=0;i--){
            while( !s.isEmpty()  && s.peek()<n[i]){
                s.pop();
            }
            int temp=n[i];
            if(s.isEmpty()){
                n[i]=-1;
            }else{
                n[i]=s.peek();
            }
            s.push(temp);
        }
        return n;
    }
    static int[] nextSmallerEl(int n[]){
        Stack<Integer> s=new Stack<>();
        int size=n.length-1;
        s.push(n[size]);
        n[size]=-1;
        for(int i=size-1;i>=0;i--){
            while( !s.isEmpty()  && s.peek()>n[i]){
                s.pop();
            }
            int temp=n[i];
            if(s.isEmpty()){
                n[i]=-1;
            }else{
                n[i]=s.peek();
            }
            s.push(temp);
        }
        return n;
    }
    static int[] prevGreaterElem(int n[]){
        Stack<Integer> s=new Stack<>();
        int size=n.length-1;
        s.push(n[0]);
        n[0]=-1;
        for(int i=1;i<=size;i++){
            while( !s.isEmpty()  && s.peek()<n[i]){
                s.pop();
            }
            int temp=n[i];
            if(s.isEmpty()){
                n[i]=-1;
            }else{
                n[i]=s.peek();
            }
            s.push(temp);
        }
        return n;
    }
}
