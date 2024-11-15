package chapter16_FileHandling_Geek.ReadFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_FileReader {
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("C:\\Users\\sumana\\Desktop\\New.txt");

        //declare loop variable
        int i;
        while ((i=fr.read())!=-1){
            System.out.print((char) i);

        }

    }
}
