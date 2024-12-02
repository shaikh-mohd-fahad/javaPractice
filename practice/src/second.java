
import java.util.ArrayList;

public class second{
    public static void main(String args[]){
        // System.out.println("hello");
        // System.out.println(fun2("abc",0,""));
        int a[]={1,2,3,14,5,6,14};
        ArrayList<Integer> list=new ArrayList<Integer>();
        // System.out.println(linearSearch3(a, 0,56));
        System.out.println(reverseNum(54321));
    }
    //subset/subsequence of given string
    static void fun(String a,int i,String s){
        if(a.length()==i){
            System.out.println(s);
            return;
        }
        char c=a.charAt(i);
        fun(a,i+1,s+c);
        fun(a,i+1,s);
    }
    //return subsequence as a list
    static ArrayList<String> fun2(String a,int i,String s){
        if(a.length()==i){
            // System.out.println(s);
            ArrayList<String>l=new ArrayList<String>();
            l.add(s);
            return l;
        }
        char c=a.charAt(i);
        ArrayList<String> left=fun2(a,i+1,s+c);
        ArrayList<String> right=fun2(a,i+1,s);
        left.addAll(right);
        return left;
    }
    //return sub sequence using iteration.
    // static ArrayList<ArrayList<Integer>> subsequ(int[] a){
    //     ArrayList<ArrayList<Integer>>ll=new ArrayList<>();
    //     ll.add();
    //     for(int i:a){
            
    //     }
    //     return ll;
    // }
    //check array is sorted or not
    static boolean sortedOrNot(int a[],int i){
        if(i==a.length-1)
            return true;
        if(a[i+1]<a[i])
            return false;
        return sortedOrNot(a, i+1);
    }

    static int linearSearch(int a[],int i,int target){
        if(i==a.length)
            return -1;
        if(a[i]==target)
            return i;
        
        return linearSearch(a, i+1,target);
    }

    // return arraylist and pass as argument
    static ArrayList<Integer> linearSearch2(int a[],int i,int target,ArrayList<Integer> list){
        if(i==a.length)
            return list;
        if(a[i]==target)
            list.add(i);
        
        return linearSearch2(a, i+1,target,list);
    }

    // return arraylist and pass as argument
    static ArrayList<Integer> linearSearch3(int a[],int i,int target){
        ArrayList<Integer>list=new ArrayList<>();

        if(i==a.length){
            return list;
        }
        if(a[i]==target)
            list.add(i);
        list.addAll(linearSearch3(a, i+1,target));
        return list;
    }

    //reverse given num using recursion
    static int reverseNum(int n){
        if(n<10)
            return n;
        String s=""+n;
        int len=s.length();
        int rem=n%10;
        int rev=(int)Math.pow(10,len-1)*rem+reverseNum(n/10);
        return rev;
    }
    static boolean  palindromeNum(int n){

        return true;
    }
}