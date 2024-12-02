
class first{
    public static void main(String args[]){
        System.out.println(fun("fahad",0));
    }
    //remove A from string
    static String fun(String s,int  i){
        if(i==s.length())
            return "";
        char c=s.charAt(i);
        if(c=='a' || c=='A')
            return fun(s,i+1);
        return c+fun(s,i+1);
    }
}