public class Practice_4 {
    public static void main(String[]args){
        Employee e1= new Employee();
        e1.name="Avishekh";
        e1.id=101;
        e1.Salary=10000.00;

        Employee e2= new Employee();
        e2.name="Avi";
        e2.id=1021;
        e2.Salary=10000.00;

        Employee e3= new Employee();
        e3.name="Aviavishekh";
        e3.id=103;
        e3.Salary=10000.00;

        e1.display();
        e2.display();
        e3.display();
    
    }
}
class Employee{
    String name;
    int id;
    double Salary;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("id"+id);
        System.out.println("Salary"+Salary);

    }
}