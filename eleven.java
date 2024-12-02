import java.util.*;
public class eleven {
    //Recursion practice
    public static void main(String[] args) {
        int a[]={3,5,46,67,3,6};
        int max=0;
        ArrayList<Integer>list=new ArrayList<>();
       System.out.print(linearSearch2(a,0,3,list));
    //    pArrEle(a,0,max);
    }
    
    static ArrayList<Integer>  linearSearch2(int a[],int i,int target,ArrayList<Integer>list){
        if(a.length==i)
        return list;
        if(a[i]==target)
        list.add(i);

        return linearSearch2(a, i+1,target,list);
    }
    static int  linearSearch(int a[],int i,int target){
        if(a.length==i)
        return -1;
        if(a[i]==target)
        return i;
        return linearSearch(a, i+1,target);
    }
    static int  sumArrEle(int a[],int i){
        if(a.length-1==i)
        return a[i];
        // sum=sum+a[i];
        return a[i]+sumArrEle(a, i+1);
    }
    static int pArrEle(int a[],int i,int max){
        if(a.length==i)
        return max;
        if(a[i]>max)
            max=a[i];
        return pArrEle(a, i+1,max);
    }
    static int sum(int n){
        if(n==1)
            return 1;
        if(n%2==0)
            return -n+sum(n-1);
        return n+sum(n-1);
    }

    static void fun2(int p,int n){
        if(n==0)
            return;
            
        fun2(p,n-1);
        System.out.println(n*p);
    }
    static int powertofDigits(int p,int n){
        if(n==1)
            return p;
        return p*powertofDigits(p,n-1);
    }
static int countofDigits(int n){
        if(n<10)
        return 1;
        return 1+countofDigits(n/10);
    }

    static int sumofDigits(int n){
        if(n<10)
        return n;
        int rem=n%10;
        return rem+sumofDigits(n/10);
    }
    static int fib(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;

        return fib(n-1)+fib(n-2);
    }
    static void fun(int n){
        if(n==0)
            return;
            fun(n-1);
            System.out.print(n);
    }
}