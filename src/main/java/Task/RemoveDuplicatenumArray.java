package Task;

import java.util.HashSet;

public class RemoveDuplicatenumArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,4,4,5,7,5,6,8,8};
        HashSet<Integer> set=new HashSet<>();  //hashset does not accept duplicate element


        for (int num:arr){
           set.add(num);
        }

        System.out.println(set);
    }
}
