import java.util.ArrayList;
public class arraylist_value_assign{
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        //to add a element in arraylist we use add() method
        list.add(1);
        list.add(2);
        list.add(3); 
        list.add(4);
        list.add(5);
        list.add(1,9); //add 9 at index 1
        System.out.println(list);

        //Get operation
        int element=list.get(2);
        System.out.println(element);

        //Delete operation
        list.remove(2);
        System.out.println(list);

        //Set operation
        list.set(2,10);
        System.out.println(list);

        //Contains operation
        System.out.println(list.contains(2));
        System.out.println(list.contains(10));
        System.out.println(list.contains(12));

        //size operation
        System.out.println(list.size());

        //print all the elements of arraylist

        System.out.println("Printing all tthe elements of Arraylist by using for loop");
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}