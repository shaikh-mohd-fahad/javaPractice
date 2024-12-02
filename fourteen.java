import java.util.Arrays;

public class fourteen {
    public static void main(String[] args) {
        int arr[]={3,5,2,-5,-543,0,435,6};
        System.out.println(Arrays.toString(arr));
        System.out.println("insertion sort");
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int arr[]){
       for(int i=1; i<arr.length; i++){
            for(int j=i;j>=1;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void selectSort(int arr[]){
        int min,pos;
       for(int i=0; i<arr.length-1; i++){
            min=arr[i];
            pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    pos=j;
                }
            }
            swap(arr,pos,i);
        }
    }
    static void bubbleSort(int arr[]){
       for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
   static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
