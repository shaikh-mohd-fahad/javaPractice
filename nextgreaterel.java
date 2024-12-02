import java.util.*;
public class nextgreaterel {
    public static void main(String[] args) {
        int a[]={1,5,3,2,1,6,3,4};
        System.out.println(Arrays.toString(a));
        greaterel(a);
        System.out.println(Arrays.toString(a));
    }
    //my method
    static void greaterel(int a[]){
        int len=a.length;
        int max=a[len-1];
        a[len-1]=-1;
        for(int i=len-2;i>=0;i--){
            max=(int)Math.max(max,a[i]);
            if(max==a[i])
                a[i]=-1;
            else if(a[i]<a[i+1])
                a[i]=a[i+1];
            else 
                a[i]=max;
        }
    }
}
