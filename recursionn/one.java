package recursionn;

public class one {
    public static void main(String[] args) {
        int a[]={14567,6,5565,7,9,99999};
        // System.out.println(isPalinStr1("fahad","",0));
        String s="madam";
        System.out.println(isPalinStr1(s,0,s.length()-1));
    }

    //fibonacci
    static int fib(int n){
        if(n==1 || n==0)
            return n;
        return fib(n-1)+fib(n-2);
        
    }
    //reverse
    static int reverse(int n){
        if(n<10)
        return n;
        int temp=(int)Math.log10(n);
        
        return (int)Math.pow(10,temp)*(n%10) +reverse(n/10);
    }
    //palindrome number ****** ye work nhi kr rha" *****
    static boolean palind(int n, int m){
        
        if(n==0)
            return n==m;
        int temp=(int)Math.log10(n);
        m=m+(int)Math.pow(10,temp)*(n%10);

        return palind(n/10, m);
    }
    /// linear search
    static int linearSearch(int a[],int i,int target){
        if(a.length==i){
            return -1;
        }
        if(a[i]==target){
            return i;
        }
        return linearSearch(a, i+1, target);
    }

    //binary search
    static int binarySearch(int a[],int s,int e,int target){
        if(s>e)
            return -1;
        int mid=(e+s)/2;
        
        if(a[mid]==target){
            return mid;
        }
        else if(a[mid]<target){
            s=mid+1;
            return binarySearch(a, s, e, target);
        }
        e=mid-1;
        return binarySearch(a, s, e, target);
    }
    //max element in array
    static int maxEle1(int a[],int i,int max){
        if(i==a.length)
            return max;
        max=Math.max(max,a[i]);
        return maxEle1(a,i+1,max);
    }

    static int maxEle2(int a[],int i){
        if(i==a.length-1)
            return a[i];
        return (int)Math.max(maxEle2(a,i+1),a[i]);
    }

    //Remove 'a' from String 
    static String RemoveA1(String s1,String s2,int i){

        if(i==s1.length())
            return s2;
        char c=s1.charAt(i);
        if(c!='a')
            s2+=c;
        return RemoveA1(s1,s2,i+1);
    }
    static String RemoveA2(String s1,int i){

        if(i==s1.length())
            return "";
        char c=s1.charAt(i);
        if(c!='a')
            return c+RemoveA2(s1, i+1);
        return RemoveA2(s1,i+1);
    }

    // ******* Reverse String ****
    static String revStr(String s,int i){
        if(s.length()==i)
            return "";
        char c=s.charAt(i);
        return revStr(s,i+1)+c;
    }
    // *********** String palindrome *******
    static boolean isPalinStr1(String s1,int s,int e){
        if(s>=e){
            return true;
        }
        if(s1.charAt(e)!=s1.charAt(s))
            return false;
        
            return isPalinStr1(s1, s+1, e-1);
    }

    
}
