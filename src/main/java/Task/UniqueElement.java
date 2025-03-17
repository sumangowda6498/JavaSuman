package Task;

public class UniqueElement {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,3,2,1};

        int unique=0;
        int size= arr.length;
        for(int num:arr){
            unique ^=num;

        }
        System.out.println(unique);

    //if more than one unique elemnt present




    }


}
