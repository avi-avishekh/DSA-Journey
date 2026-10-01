public class Rect_Area_Perimeter {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=10;
        r1.breadth=7;

        r1.area();
        r1.Perimeter();
    }
}

class Rectangle{
    int length;
    int breadth;

    void area(){
        System.out.println("Area:"+ length*breadth);
    
    }
    void Perimeter(){
        System.out.println("Perimeter:"+ 2*(length+breadth));
    }
}
