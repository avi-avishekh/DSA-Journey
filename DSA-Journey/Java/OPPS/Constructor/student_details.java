class Student{
    String name;
    int age;
    

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
    }
}

public class student_details {
    public static void main(String[]args){
        Student S1= new Student("Avishekh",20);
        S1.display();
    }
}
