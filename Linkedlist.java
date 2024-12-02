class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class list{
    Node head=null;

    public void add(int data){
        Node temp=new Node(data);
        temp.next=null;
        if(head==null){
            head=temp;
        }
        else{
            Node ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }
    public void print(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }
}
public class Linkedlist {
    public static void main(String[] args) {
        list l=new list();
        l.add(5);
        l.add(3245);
        l.print();
    }

}
