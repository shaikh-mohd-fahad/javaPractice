/* two pointer */
import  java.util.*;
class Second{
    public static void main(String[] args) {
        int a[]={1,1,1,0,0,0,1,1,1,1,0},k=3;
        // System.out.println(maxSumSub(a,k));;
        // String s="cadbzabcd";
        // subSeqLen(s);
        maxLenOne(a,2);
    }

    /*
     * Maximum Sum Subarray of Size K
Problem: Find the maximum sum of any subarray of length 
𝑘
k.

Input: arr = [2, 1, 5, 1, 3, 2], k = 3
Output: 9 (sum of subarray [5, 1, 3])
     */
    static int maxSumSub(int a[], int k){
        int sum=0,maxSum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        maxSum=Math.max(sum, maxSum);
        for(int i=k;i<a.length;i++){
            sum+=a[i]-a[i-k];
            maxSum=Math.max(sum, maxSum);
        }
        return maxSum;
    }

    static void maxSumCard(int a[],int k){
        int sum=0,maxSum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        maxSum=Math.max(maxSum,sum);
        for(int i=k-2;i>=0;i--){
            sum+=a[i]-a[i];
        }
    }

    // ******** longest sequence of string without repeating characters
    //String s="cadbzabcd"
    static void subSeqLen(String s){
        int maxLen=0,len=0;
        HashMap<Character,Integer> h=new HashMap<>();
        int l=0,r=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(h.containsKey(c) && h.get(c)>l){
                l=h.get(c)+1;
                h.put(c,r);
            }else{
                h.put(c,r);
            }
            len=r-l+1;
            maxLen=(int)Math.max(maxLen,len);
            r++;
        }
        System.out.println("maxlen= "+maxLen);
    }
// find maxlen of consecutive ones with atmost k zeroes
// ex int n=11110000111, maxlen=6
static void maxLenOne(int a[],int k){
    int count=0,l=0,r=0,maxLen=0;
    while(r<a.length){
        System.out.println(r);
        if(a[r]==0)
            count++;
        if(a[r]==1 && count<=2){

            r++;
        }else if (count==3) {
            if(a[l]==0)
                count--;
            else
                l++;
        }
        maxLen=Math.max(maxLen,r-l+1);
    }
    System.out.println("maxlen="+maxLen);
}
}