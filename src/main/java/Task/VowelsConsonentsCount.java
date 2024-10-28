package Task;

public class VowelsConsonentsCount {
    public static void main(String[] args) {
        String str="Automation";
        int vowels=0,consonents=0;
        for(int i=0;i<str.length();i++){
            if("aeiouAEIOU".indexOf(str.charAt(i))!=-1){
               vowels++;
            }else if(Character.isLetter(str.charAt(i))){
                consonents++;
            }
        }
        System.out.println("Consonents: "+consonents+" Vowels:"+vowels);
    }

}
