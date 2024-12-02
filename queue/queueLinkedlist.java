package queue;

public class queueLinkedlist {
    public static void main(String[] args) {
        queu a=new queu();
        a.add(45);
        a.add(454);
        a.add(3);
        a.add(9);
        a.display();
        System.out.println("size: " +a.size());
        System.out.println("peek: "+a.peek());
        System.out.println("remove: "+a.remove());
        a.display();
        System.out.println("size: " +a.size());
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class queu{
    private Node r=null,f=null;
    private int size=0;
    void add(int n){
        Node temp=new Node(n);
        if(f==null && r==null){
            f=temp;
            r=temp;
        }
        else{
            r.next=temp;
            r=r.next;
        }
        size++;
    }
    int peek(){
        return f.data;
    }
    int remove(){
        int x=f.data;
        f=f.next;
        size--;
        return x;
    }
    void display(){
        Node t=f;
        while(t!=r.next){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.err.println();
    }
    int size(){
        return size;
    }
}
