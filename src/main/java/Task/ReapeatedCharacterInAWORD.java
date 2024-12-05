package Task;

import java.util.Scanner;

public class ReapeatedCharacterInAWORD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.nextLine();
        
        int position=findrepatedLetter(word);
        if (position==-1){
            System.out.println("No character repeated");
        }else{
            System.out.println("the charcter "+word.charAt(position)+" is repeated first repeated");
        }

    }

    private static int findrepatedLetter(String word) {
        int pos=-1;
        for (int i=0;i<word.length();i++){
            for (int j=1;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    pos=i;
                    return pos;
                }
            }
        }

        return pos;
    }
}
