/* 2 pointer and sliding window */
import java.util.*;
class First{
    public static void main(String ars[]){
        int a[]={-1, 0, 1, 2, -1, -4},k=6;
        // sumK(a, k);
        // System.out.println(removeDub(a));;
        threeSum(a);
        // String s="a man, a plan, a canal: panama";
        // System.out.println(strPalind(s));
    }
    //****** sum of subarray of size k=4*/
    static void sumK(int a[],int k){
        int l=0,r=k-1;
        int n=a.length;
        while(r<n){
            int t=l;
            int sum=0;
            while(t<=r){
                sum+=a[t];
                t++;
            }
            System.out.print(" "+sum);
            r++;
            l++;

        }
    }
    /*
     * Two Sum (sorted array)
    Problem: Given a sorted array, find two numbers that add up to a target sum.
     */
    static void towSum(int a[],int target){
        int l=0,n=a.length;
        int r=n-1;
        int sum=0;
        while(l<r){
            sum=a[l]+a[r];
            if(sum==target){
                System.out.println(a[l]+" "+a[r]);
                break;
            }
            else if(sum>target){
                r--;
            }
            else
                l++;
        }
    }
    /*
     * Remove Duplicates from Sorted Array
Problem: Given a sorted array, remove duplicates in-place and return the new length.
Input: arr = [1, 1, 2, 2, 3, 4, 4, 5]
Output: 5 (modified arr = [1, 2, 3, 4, 5])
     */

    static int removeDub(int a[]){
        int l=0,r=1,len=1;
        int k=l+1;
        while(r<a.length){
            if(a[l]!=a[r]){
            a[k]=a[r];
             l=r; 
             k++;
             len++;
            }
            r++;
        }
        System.out.println(Arrays.toString(a));
        return len;
    }

    /*
     * Move Zeroes
Problem: Move all zeros in an array to the end while maintaining the relative order of the other elements.

Input: arr = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
     */
    static void moveZero(int a[]){
        int l=0,r=1;
        while(r<a.length){
            if(a[l]==0 && a[r]!=0){
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r++;
            }
            else if(a[l]!=0){

                l++;
                if (r <= l) r = l + 1;
            }
            else if(a[r]==0)
                r++;

        }
        System.out.println(Arrays.toString(a));
    }


/*
 * Container With Most Water
Problem: Given an array where each element represents the height of a line, find the maximum amount of water two lines can contain.

Input: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
Output: 49 (formed by lines at index 1 and 8)
 */


 /*
  * Valid Palindrome
Problem: Check if a given string is a palindrome, ignoring non-alphanumeric characters.

Input: s = "A man, a plan, a canal: Panama"
Output: true
  */

  static  boolean  strPalind(String s){
    int l=0,r=s.length()-1;
    while(l<r){
        char c1=s.charAt(l);
        char c2=s.charAt(r);
        if(Character.isLetter(c1) && Character.isLetter(c2)){
            System.out.println(c1+" "+c2);
            if(c1==c2){
                l++;
                r--;
                continue;
            }
            else{
                return false;
            }
        }
        if(!Character.isLetter(c1))
            l++;
        if(!Character.isLetter(c2))
            r--;
    }
    return true;
  }


  /*
   * 3Sum
Problem: Find all unique triplets in an array that sum up to zero.

Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
   */
  static void threeSum(int a[]){
    int sum=0;
    ArrayList<Integer> l=new ArrayList<>();
    ArrayList<ArrayList<Integer>> lol=new ArrayList<>();
    for(int i=0;i<3;i++){
        sum+=a[i];
        l.add(a[i]);
    }

    if(sum==0)
        lol.add(new ArrayList<>(l));
    for(int i=3;i<a.length;i++){
        sum+=a[i]-a[i-3];
        System.out.println("sum="+sum);
        if(sum==0)
            lol.add(new ArrayList<>(l));
    }
    System.out.println(lol);
  }
}