
public class multiple_catch_block {
    public static void main(String[] args) {
        try {
            int []arr={10,20,30};
            System.out.println(arr[5]);
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Problems");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is invalid");
        }
    }
}
