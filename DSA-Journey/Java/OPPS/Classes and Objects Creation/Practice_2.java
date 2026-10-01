public class Practice_2 {
    public static void main(String[]args){
        Student S1=new Student();
        S1.name="Avishekh";
        S1.age=20;
        S1.course="CSE";
        S1.display();
        Student S2; //S2 is not a object it is reference which can be used in creation of object.
    }
}
class Student{
    String name;
    int age;
    String course;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }
}
