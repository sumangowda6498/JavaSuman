package Task;

import java.util.ArrayList;

public class
Collectiontask_Amazon_repeatedNumberArray {
    public static void main(String[] args) {

        int a[]={4,5,5,5,6,4,6,7,4,4};

        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            int k=0;
            if(!al.contains(a[i])){
                al.add(a[i]);
                k++;

                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        k++;
                    }
                }
                System.out.println(a[i]+":"+k+" time");
            }else{i++;}

        }



    }
}
