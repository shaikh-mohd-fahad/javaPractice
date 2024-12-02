public class twelve {
    public static void main(String[] args) {
        System.out.println(reverseString("hello",0));
    }
    static String reverseString(String s1,int i){
        if(i==s1.length())
        return "";
        
        return ""+reverseString(s1,i+1)+s1.charAt(i);
    }
    static String removeA(String s1,String s2,int i){
        if(i==s1.length())
        return s2;
        if(s1.charAt(i)=='a'||s1.charAt(i)=='A')
        s2+="";
        else
        s2+=s1.charAt(i);
        return removeA(s1,s2,i+1);

    }
}
