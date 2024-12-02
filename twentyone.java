import java.util.*;
class twentyone{
    public static void main(String[] args) {
        String s[]={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};

        // System.out.println(removeSpecialChar(""));
        System.out.println( isPalindrome("0P"));
        // System.out.println(Arrays.toString(a));
    }

    public static boolean isPalindrome(String s) {
        
       s= removeSpecialChar(s);
       if(s.length()<=1)
            return false;
        for(int i=0,j=s.length()-1; i<s.length()/2; i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static String  removeSpecialChar(String s){
        String ss="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(Character.isAlphabetic(c) && Character.is){
                ss+=Character.toLowerCase(c);
            }
        }
        return ss;
    }

    public static int CountEmail(String[] emails) {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String temp=emails[i];
           
            int idx=temp.indexOf('+');
            int idx2=temp.indexOf('@');
            String temp2=temp.substring(0,idx);
            temp2=temp2.replace(".","");
            h.add(temp2+temp.substring(idx2,temp.length()));
    }
        return h.size();
    }
}