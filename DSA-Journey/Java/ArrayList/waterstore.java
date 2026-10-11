import java.util.ArrayList;
public class waterstore {
    public static int storeWater(ArrayList<Integer>height){

        int maxWater=0;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht=Math.min(height.get(i), height.get(j));
                int wd=j-1;
                int curr= ht*wd;
                maxWater=Math.max(maxWater, curr);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(height);

        System.out.println("Maximum Stored water:"+storeWater(height));
    }
    
}
