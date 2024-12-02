public class fifteen {
    public static void main(String args[]){

    }
    static void mergeSort(int arr[],int l,int r){
        if(l>r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr, mid+1, r-1);
        merge(arr,l,r,mid);
    }
    static void merge(int arr[],int l,int r,int mid){
        int n1=mid-l+1;
    }
}
