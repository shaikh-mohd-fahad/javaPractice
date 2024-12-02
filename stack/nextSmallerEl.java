import java.util.*;

public class nextSmallerEl {
    public static void main(String[] args) {
        int a[]={5,2,4,6,3,5};
        System.out.println(Arrays.toString(a));
        nextSmEl(a);
        System.out.println(Arrays.toString(a));
    }
    static void nextSmEl(int a[]){
        int len=a.length;
        Stack<Integer> st=new Stack<>();
        st.push(a[len-1]);
        a[len-1]=-1;
        for(int i=len-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()>a[i]){
                st.pop();
            }
            int temp=a[i];
            if(st.isEmpty())
                a[i]=-1;
            else
                a[i]=st.peek();
            st.push(temp);
        }
    }
}
