package OPPS.Encalpsulation;
public class basic {
    public static void main(String[]args){

        Std S=new Std();
        S.setName("Avishekh");
        S.setAge(20);

        System.out.println(S.getName());
        System.out.println(S.getAge());
   }
}
class Std{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
