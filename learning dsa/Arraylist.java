import java.util.*;
public class Arraylist {
    public static void swap(ArrayList<Integer> list, int i, int j){
    
        list.set(i,list.get(j));
        list.set(j,list.get(i));

    }
    public static void multiArraylist(ArrayList<ArrayList<Integer>> mainlist, ArrayList<Integer> list){

    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(8);
        list.remove(3);
        list.set(1,8);
        System.out.println(list.get(1));
        System.out.println(list.contains(6));
        int max = Integer.MIN_VALUE;
        //System.out.println(list, list.reverseOrder());
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
            max = Math.max(max,list.get(i));
        

        }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        

    }   
    
}
