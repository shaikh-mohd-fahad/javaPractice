import java.util.*;
//cycle sort
public class four{
    public static void main(String[] args) {
        int arr[]={3,4,5,2,1,10,7,6,9,8};
         System.out.println(Arrays.toString(arr));
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
}
static void cyclesort(int []arr){
    int s=0,e=arr.length;
    while(s<e){
        if(arr[s]-1==s){
            s++;
        }
        else{
            swap(arr,s,arr[s]-1);
        }
        // System.out.println('h');
    }
    
}
static void swap(int arr[],int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}

}