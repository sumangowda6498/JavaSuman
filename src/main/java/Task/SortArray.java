package Task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={4,2,0,7,6};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
