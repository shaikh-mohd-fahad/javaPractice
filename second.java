public class second {
    public static void main(String[] args) {
        fun(0,0);
    }
    static void fun(int row,int col){
        if(row==4){
            return ;
        }
        if(col<=row){
            System.out.print("* ");
            fun(row,++col);
        }else{
        System.out.println();
        fun(++row,0);
        }
        
    }
    // static void fun(int row,int col){
    //     if(row==0){
    //         return ;
    //     }
    //     if(row==col){
    //         System.out.println();
    //         fun(--row,0);
    //     }else{
    //     System.out.print("* ");
    //     fun(row,++col);
    //     }
        
    // }
}
