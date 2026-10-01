public class chaining {
    public static void main(String[]args){
        S1 s=new S1();
    }
    
}
class S1{
    S1(){
        this(10);
        System.out.println("A");
    }
    S1(int age){
        System.out.println("B");
    }
}
