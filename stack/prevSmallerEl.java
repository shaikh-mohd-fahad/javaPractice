import java.util.*;

public class prevSmallerEl {
    public static void main(String[] args) {
        int a[]={5,2,4,6,3,5};
        System.out.println(Arrays.toString(a));
        prevSmEl(a);
        System.out.println(Arrays.toString(a));
    }

    static void prevSmEl(int a[]){
        int len=a.length;
        Stack<Integer> st=new Stack<>();
        st.push(a[0]);
        a[0]=-1;
        for(int i=1;i<len;i++){
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

    //previous smaller and equal element syock span gfg
    static void prevSmEl2(int a[]){
        int len=a.length;
        Stack<Integer> st=new Stack<>();
        st.push(a[0]);
        int c=1;
        System.out.print(c+" ");
        for(int i=1;i<len;i++){
            c=1;
            Stack<Integer> sttemp=(Stack<Integer>) st.clone();
            while(!sttemp.isEmpty() && sttemp.peek()<a[i]){
                c++;
                sttemp.pop();
            }
            System.out.print(c+" ");
            st.push(a[i]);
        }
    }
}
