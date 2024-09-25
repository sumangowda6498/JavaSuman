import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class chapter13Exeception {
    public static void main(String[] args) {
        //createnewFile();
        numbersExceptionHandling();
        numbersExceptionHandling2();


    }



    private static void createnewFile() {
        File file= new File("resources/nonexistant.txt");
        try {
            file.createNewFile();

        }catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    private static void numbersExceptionHandling() {
        File file= new File("resources/number.txt");
        Scanner fileReader=null;
       try {
            fileReader=new Scanner(file);  //file not found exception
           while (fileReader.hasNext()){
double num=fileReader.nextDouble();
               System.out.println(num);
           }
       }catch (FileNotFoundException |InputMismatchException e){
           System.out.println("\nnumbersExceptionHandling");
            e.printStackTrace();
       }finally {
           fileReader.close();
       }

    }

    private static void numbersExceptionHandling2() {
        File file= new File("resources/number.txt");

        try(Scanner fileReader=new Scanner(file)) {
           //file not found exception
            while (fileReader.hasNext()){
                double num=fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException |InputMismatchException e){

            System.out.println("\nnumbersExceptionHandling2"); e.printStackTrace();
        }
    }
}
