package Task;

public class StarsTraingle {
    public static void main(String[] args) {
        int len=5;
        for(int i=1;i<=len;i++){
            for(int b=(i-1);b<len;b++){
                System.out.print(" ");
            }
            int q=1;
            while(q<i){
                System.out.print("* ");
                q++;
            }
            System.out.print("*");

                for(int a=(i-1);a<len;a++){
                    System.out.print(" ");
                }
            System.out.println();
        }

    }

    }

