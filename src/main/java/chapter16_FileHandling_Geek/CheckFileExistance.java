package chapter16_FileHandling_Geek;

//Program to check if a file or directory physically exists or not.

import javax.sound.midi.Soundbank;
import java.io.File;

public class CheckFileExistance {
    public static void main(String[] args) {
        // accept file name or directory name through
        String fname= "C:/Users/suman/Desktop/TAU_Selenium_Webdriver.txt";

        // pass the filename or directory name to File
        // object
        File f = new File(fname);

        // apply File class methods on File object
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath()); //Converts this abstract pathname into a pathname string
        System.out.println("Absolute path:" + f.getAbsolutePath());   //Returns the absolute pathname string of this abstract pathname. return String
        System.out.println("Parent: "+f.getParent());
        System.out.println("Exist: "+f.exists());


        if(f.exists()){
            System.out.println("Is wirteable: "+f.canWrite());
            System.out.println("Is readable "+f.canRead());
            System.out.println("Is a Directory "+f.isDirectory());
            System.out.println("File Size in Bytes:"+f.length());
        }

    }
}
