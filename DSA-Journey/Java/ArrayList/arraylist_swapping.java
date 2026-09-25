import java.util.ArrayList;
public class arraylist_swapping {
    public static void main(String[]args){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);

        int temp=arr.get(0);
        arr.set(0,arr.get(1));
        arr.set(1,temp);
        System.out.println(arr);
    }
}
