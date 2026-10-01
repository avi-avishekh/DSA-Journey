
public class Exception {
    public static void main(String[]args){
        int a=10;
        int b=0;

        try {
            System.out.println(a/b);
            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0..");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
    
}
