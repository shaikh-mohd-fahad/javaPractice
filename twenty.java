public class twenty {
    public static void main(String[] args) {
        int a[]={1,3,4,6};
        System.out.println(binarySearch(a,2));
    }
    static int binarySearch(int []a,int target){
        int mid=0,l=0,r=a.length-1;
        while(l<=r){
            mid=l+(r-l)/2;
            if(a[mid]==target)
                return mid;
            else if(target>a[mid])
                l=mid+1;
            else{
                r=mid-1;
            }
        }
        return l;
    }
}
