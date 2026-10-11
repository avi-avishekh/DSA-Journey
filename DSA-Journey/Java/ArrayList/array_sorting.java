import java.util.ArrayList;
import java.util.Collections;

public class array_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(6);
        list.add(30);
        list.add(43);
        list.add(0);
        list.add(28);

        System.out.println(list);

        //default Ascending Order 
        Collections.sort(list);
        System.out.println("Ascending Order:"+list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order:"+list);
    }
}

