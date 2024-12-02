import java.util.*;
public class nextgreaterel{
    public static void main(String[] args) {
        int a[]={1,5,3,2,1,6,3,4};
        System.out.println(Arrays.toString(a));
        nextGtEl(a);
        System.out.println(Arrays.toString(a));
    }
    static void nextGtEl(int a[]){
        int len=a.length;
        Stack<Integer> st=new Stack<>();
        st.push(a[len-1]);
        a[len-1]=-1;
        for(int i=len-2;i>=0;i--){
            // System.out.println(Arrays.toString(a));
            while(!st.isEmpty() && st.peek()<a[i]){
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