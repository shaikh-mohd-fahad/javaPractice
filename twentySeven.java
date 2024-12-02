
public class twentySeven {
    public static void main(String args[]){
        DBlist l=new DBlist();
        l.insert(5);
        l.insert(32);
        l.insert(53);
        l.insert(7);
        l.insert(8);
        // System.out.println(l);
        l.display();
    }

}
class Node{
    int data;
    Node prev,next;
    public Node(int data){
        this.data=data;
    }
}
class DBlist{
    int size=0;
    static Node head=null;
    public  void insert(int data){
        Node temp=new Node(data);
        if(head==null){
           temp.prev=null;
           temp.next=null;
           head=temp;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            temp.prev=ptr;
            ptr.next=temp;
        }
    }
    public  void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
}