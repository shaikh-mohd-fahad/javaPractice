public class third{
    public static void main(String arg[]){
        int[]a={1,2,3,4,5,6,7,8,9};

        System.out.println(binarySort(a,0,8,900));
    }
    static int binarySort(int []a,int s,int e,int target){
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(a[mid]==target)
            return mid;
        if(target>a[mid])
            return binarySort(a,mid+1,e,target);
       
           return  binarySort(a,s,mid-1,target);
        // return 0;
    }
}