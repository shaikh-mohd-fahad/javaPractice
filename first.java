import java.util.*;
class first{
    public static void main(String args[]){
       int a[]={4,3,2,7,8,2,3,1};
       first f=new first();
       List<Integer> list=new ArrayList<>();
        f.cycleSort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]-1!=i)
                list.add(i+1);
        }
        System.out.println(Arrays.toString(a));

    }
    public int cycleSort(int ar[]){

        int start=0,end=ar.length-1;
        while(start<end){
            if(ar[start]-1==start){
                start++;
            }
            else{
                swapp(ar,start,ar[start]-1);
            }
        }
        

        return 0;
    }
    public int swapp(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return 0;
    }
}