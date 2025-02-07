package Task;

public class Words_inSentence {
    public static void main(String[] args) {
        String sentence="Programing is fun and Challenging";
        System.out.println("Number of words in Sentence: "+countWords(sentence));
    }

    static int countWords(String sentence){
        // Initialize count to 1 assuming at least one word is present
        int count=1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}
