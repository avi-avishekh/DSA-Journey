public class Calculator {
    public static void main(String[]args){
        Calculate c1=new Calculate();

        c1.a=8;
        c1.b=5;
        System.out.println("Addition:"+c1.add());
        System.out.println("Substraction:"+c1.subtract());
        System.out.println("Multiplication:"+c1.mul());
    }
}

class Calculate{
    int a;
    int b;

    int add(){
        return a+b;
    }
    int subtract(){
        return a-b;

    }
    int mul(){
        return a*b;
    }

}
