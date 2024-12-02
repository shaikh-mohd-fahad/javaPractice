
class thirteen{
    public static  void main(String[] args) {
        int arr2[]={4,5,6,5,2,6,2,4};
        System.out.println(frogJump(arr2,0,0));
    }
    static int frogJump(int arr[],int i,int sum){
        if(i==arr.length-1)
            return sum;
        if(Math.abs(arr[i]-arr[i+1])>=Math.abs(arr[i]-arr[i+2])){
            sum=sum+(int)Math.abs(arr[i]-arr[i+2]);
            return frogJump(arr,i+2,sum);
        }
        else{
            sum=sum+(int)Math.abs(arr[i]-arr[i+1]);
            return frogJump(arr,i+1,sum);
        }
    }
}