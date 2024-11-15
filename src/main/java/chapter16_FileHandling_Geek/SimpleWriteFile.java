package chapter16_FileHandling_Geek;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleWriteFile {
    public static void main(String[] args) throws IOException {
String str="Simple Write program";
String path="C:/User/sumana/Desktop/New.txt";
            FileWriter wr=new FileWriter(path);
            wr.write(str);
            wr.close();
        System.out.println("Write successfull");








    }
}
