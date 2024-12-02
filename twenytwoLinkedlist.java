class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class linkedlist{
     static Node head,tail;
    static void add(int data){
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else{
            tail.next=temp;
        }
        tail=temp;
    }
    static void addBeg(int data){
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else{
        temp.next=head;
        head=temp;
        }
    }
    static void addAtpos(int data,int pos){
        if(pos==0)
        addBeg(data);
        else{
        int c=0;
        Node ptr=head;
        while(c<pos-1){
            c++;
            ptr=ptr.next;
        }
        Node temp=new Node(data);
        temp.next=ptr.next;
        ptr.next=temp;
    }
    }
    void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+ " ");
            ptr=ptr.next;
        }
        System.out.println();
    }
}
public class twenytwoLinkedlist {
    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.add(10);
        l.add(20);
        l.display();
        l.addBeg(2);
        l.addBeg(6);
        l.add(76);
        l.display();
        l.addAtpos(5, 6);
        l.display();
    }
    
}