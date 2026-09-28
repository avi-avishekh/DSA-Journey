public class Practice_1 {
    public static void main(String[] args) {
        
        Car c1=new Car();
        c1.brand="BMW";
        c1.showBrand();
    }
}


class Car{
    String brand;

    void showBrand(){
        System.out.println(brand);
    }
}
