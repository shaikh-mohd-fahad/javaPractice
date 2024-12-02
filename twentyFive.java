import java.util.*;
public class twentyFive{
    public static void main(String args[]){
        // int num[]={4,3,2,7,8,2,3,1};
        // System.out.println(fun(num));

        System.out.println(fun2("loonbalxballpoon"));
    }

    public static int fun2(String text){
        String s="balloon";
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!h1.containsKey(s.charAt(i)))
                h1.put(s.charAt(i),1);
            else
                h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
        }
        for(int i=0;i<text.length();i++){
            if(!h2.containsKey(text.charAt(i)))
                h2.put(text.charAt(i),1);
            else
                h2.put(text.charAt(i),h2.get(text.charAt(i))+1);
        }
        System.out.println(h1);
        System.out.println(h2);
        int c=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            System.out.print(" "+h1.get(s.charAt(i)));
            // c=Math.min(c,(int)(h2.get(s.charAt(i))/h1.get(s.charAt(i))));
        }
        System.out.println();
        for(int i=0;i<s.length();i++){
            System.out.print(" "+h2.get(s.charAt(i)));
            c=Math.min(c,(int)(h2.get(s.charAt(i))/h1.get(s.charAt(i))));
        }
        System.out.println();
        return c;
    }

     public static List<Integer> fun(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i]))
            h.put(nums[i],1);
            else
             h.put(nums[i],h.get(nums[i])+1);
        }
        System.out.println(h);
        for(var e: h.entrySet()){
            if(e.getValue()==2)
                list.add(e.getKey());
        }
        return list;
    }
}