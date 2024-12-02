
import java.util.*;
//leet code ques
public class six {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        Arrays.sort(arr);
        System.out.println(arr);
        int flag=0,m=0;
        ArrayList<Integer>list=new ArrayList<>();


        for(int j=1;j<arr.length+1;j++){
            flag=0;
        for(int i=1;i<=arr.length;i++){
            m=i;
            if(i==arr[i]){
                flag=1;break;
            }
        }
        if(flag==0){
            list.add(m);
        }
        
    }
    System.out.println(list);
    }
}
