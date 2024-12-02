class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class stack{
     static Node top=null;
     int size=0;
    public  void push(int data){
        // System.out.println(a);
        Node temp=new Node(data);
        if(top==null){
            top=temp;
            size=1;
        }
        else{
            temp.next=top;
            top=temp;
            size++;
        }
    }
    public  boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    public int pop(){
        if(isEmpty())
            System.out.println("underflow");
            
        int x=top.data;
        top=top.next;
        size--;
        return x;
        }
    public  void display(){
        Node ptr=top;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public int peek(){
        if(isEmpty())
            return -1;
        return top.data;
    }
}
public class twentyThreeStack {
    public static void main(String[] args) {
        stack s=new stack();
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(53);
        s.push(35);
        s.push(-65);
        System.out.println("peek="+s.peek());
        s.display();
         System.out.println(s.isEmpty());
         System.out.println("size="+s.size);
         System.out.println("pop="+s.pop());
         s.display();
         System.out.println("size="+s.size);
         s.push(1100);
         s.display();
        // System.out.println(s);
    }
}
