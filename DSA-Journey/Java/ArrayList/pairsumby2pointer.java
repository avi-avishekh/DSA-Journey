import java.util.ArrayList;
public class pairsumby2pointer {
    public static boolean PS(ArrayList<Integer>list, int key){
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){

            if(list.get(lp)+list.get(rp)==key){
                return true;
            }
            else if(list.get(lp)+list.get(rp)>key){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int key=14;

        System.out.println(PS(list, key));
    }
    
}
