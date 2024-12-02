public class ten {
    public static void main(String[] args) {
        int a[]={2,5,6,3,4,7,7,457,45};
        int max=a[0],max2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max2=max;
                max=a[i];
            }
        }
        System.out.println("max "+max);
        System.out.println("max "+max2);
    }
}
