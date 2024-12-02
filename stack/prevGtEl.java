import java.util.*;
public class prevGtEl {
    public static void main(String[] args) {
        int a[]={1,5,3,2,1,6,3,4};
        System.out.println(Arrays.toString(a));
        prevGtEll(a);
        System.out.println(Arrays.toString(a));
    }
    static void prevGtEll(int a[]){
        int len=a.length;
        Stack<Integer> st=new Stack<>();
        st.push(a[0]);
        a[0]=-1;
        for(int i=1;i<len;i++){
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

