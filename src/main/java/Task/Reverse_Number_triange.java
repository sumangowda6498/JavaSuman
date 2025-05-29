package Task;

public class Reverse_Number_triange {
    public static void main(String[] args) {
        int row=5;
        for(int i=row;i>=1;i--){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){

                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
