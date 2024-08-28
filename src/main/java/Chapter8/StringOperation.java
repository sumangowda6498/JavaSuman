package Chapter8;

public class StringOperation {
    public static void main(String[] args) {
        //countwords("I will become a developer");
       // reverseString("PAKI STAN");
       // reverseString2("PAKISTAN");
        addSpaces("HappyWeekendToAll");

    }

    private static void reverseString2(String paki_stan) {
        String revrse="";
        for (int i=0;i<paki_stan.length();i++){
            revrse=paki_stan.charAt(i)+revrse;
        }
        System.out.println();
        System.out.println(revrse);
    }

    private static void reverseString(String paki_stan) {
        for(int i=paki_stan.length()-1;i>=0;i--){
            System.out.print(paki_stan.charAt(i));
        }
    }

    public static void countwords(String text){
        var word=text.split(" ");
        int wordLength= word.length;
        String message= String.format("Your sentence contains %d word",wordLength);
        System.out.println(message);

        for(String words:word){
            System.out.printf(words+" ");
        }

    }
    public static void addSpaces(String text){
                                                 //0123456789
       var modifiedtext=new StringBuilder(text);//HappyWeekendToAll
       for (int i=0;i<modifiedtext.length();i++){
          if(i!=0 && Character.isUpperCase(modifiedtext.charAt(i))){
              modifiedtext.insert(i, " ");
              i++;
          }
       }
        System.out.println(modifiedtext);
    }
}
