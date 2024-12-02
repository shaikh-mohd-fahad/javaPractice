import java.util.HashMap;

class senteen{
    public static void main(String args[]){
        int arr[]={3,51,6,2,31};
System.out.println(twoSum(arr,587).toString());
    }
    static int[] twoSum(int arr[],int target){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(target-arr[i])){
                return new int[] {i,h.get(target-arr[i])};
            }
            else{
                h.put(arr[i],i);
            }
        }
        return new int[] {-1};
    }
}