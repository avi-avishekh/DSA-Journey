import java.util.ArrayList;
public class ThreeD {
    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        //length of array can be different 

        System.out.println(mainList);


        //nested Loops
        for(int i=0; i<mainList.size();i++){
            ArrayList<Integer> curr= mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }


    }
}
