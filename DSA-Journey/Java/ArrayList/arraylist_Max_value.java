import java.util.ArrayList;
public class arraylist_Max_value {
    public static void main(String[]args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);

        int max=arr.get(0);

        for(int i=0; i<arr.size()-1;i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        System.out.println("Max Value of the ArrayList: " + max);
    }
}
