package chapter16_FileHandling_Geek.ReadFile;

import java.io.*;

public class ReaFile_BufferReader {
    public static void main(String[] args) throws IOException {

        // File path is passed as parameter
        File file=new File("C:\\Users\\sumana\\Desktop\\New.txt");

        BufferedReader br=new BufferedReader(new FileReader(file));

        String st;
        String yt;
        yt=br.readLine();

        System.out.println(yt);

        while((st= br.readLine())!=null){
           System.out.println(st);

      }


    }
}
