import java.util.*;
public class Containerwithmostwater {
   /*  public static int storewater(ArrayList<Integer> height){
        int max_water = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int length = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currwater = length*width;
              /*  if(max_area < area){
                    max_area = area;
                }
                max_water = Math.max(max_water, currwater);

            }
        }
        return max_water;

    }*/
    public static int optimizewater(ArrayList<Integer> height){
        int max_water = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            if(lp<rp){
                int ht = Math.min(height.get(lp), height.get(rp));
                int wt = rp-lp;
                int currwater = ht*wt;
                max_water = Math.max(max_water, currwater);
                lp++;
            }
            else{
                int ht = Math.min(height.get(lp), height.get(rp));
                int wt = rp-lp;
                int currwater = ht*wt;
                max_water = Math.max(max_water, currwater);
                rp--;
            }
        }

        return max_water;
    }
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(4);
        height.add(8);
        height.add(6);
        height.add(2);
        System.out.println(optimizewater(height));
       


        

    }
    
    
}
