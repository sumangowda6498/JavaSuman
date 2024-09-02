package chapter4_loop;
import java.util.Scanner;
/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 */

public class LetterSpeechForLoop {

    public static void main(String args[]){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        int i=0;

        //Search text for letter A
        for( i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A' in the "+i+" position");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}

