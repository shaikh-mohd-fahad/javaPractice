package queue;
//array implementation of que
class queuee {
    public static void main(String[] args) {
        que a=new que();
        a.add(5);
        // System.out.println(a.q);
        System.out.println("size: " +a.size());
        // a.print();
        a.add(67);
        a.add(465);
        a.add(23);
        a.add(32);
        // a.add(343);
        a.print();
        System.out.println("peek: "+ a.peek());
        System.out.println("removev : "+ a.remove());
        System.out.println("size: " +a.size());
        a.print();
    }
}
class que{
    private int q[]=new int[5];
    private int size=0,f=-1,r=-1;
    void add(int n){

        if(f==-1 && r==-1){
            f++;
            r++;
            q[f]=n;
        }else{
            r++;
            q[r]=n;
        }
        size++;
    }
    int size(){
        return size;
    }
    int peek(){
        return q[f];
    }
    int remove(){
        int x=q[f];
        f++;
        size--;
        return x;
    }
    void print(){
        for(int i=f;i<=r;i++){
            System.out.print(q[i]+" ");
        }
        System.out.println();
    }

}