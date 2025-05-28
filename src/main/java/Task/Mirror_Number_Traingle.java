package Task;

public class Mirror_Number_Traingle {
    public static void main(String[] args) {
        int row=5;
        for (int i=1;i<=row;i++){
            for (int j=i;j<row;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                    System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
