import java.util.ArrayList;
public class storeWater_2pointer {

    public static int StoredWater(ArrayList<Integer>Height){
        int maxWater=0;
        int lp=0;
        int rp=Height.size()-1;

        while(lp<rp){
            //Calculate water Area
            int ht= Math.min(Height.get(lp),Height.get(rp));
            int wd=rp-lp;
            int currWater=ht*wd;
            maxWater=Math.max(maxWater,currWater);

            //update ptr
            if(Height.get(lp)<Height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[]args){
        ArrayList<Integer>Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println(Height);
        System.out.println("Maximum water stored:"+StoredWater(Height));

    }
}
