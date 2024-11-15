package GeekForGeek;

public class ComparingStrings {
    public static void main(String[] args) {
        String str1="GeeksforGeeks";
        String str2="Practice";
        String str3="Geeks";
        String str4=new String("Geeks");
        String str5=new String("geeks");


        System.out.println("Comparing " + str1 + " and " + str2 + " : " + str1.equals(str2));
        System.out.println("Comparing "+str3+" and"+str4+" : "+str3.equals(str4));
        System.out.println("Comparing "+str4+" and "+str5+" : "+str4.equals(str5));
        System.out.println("Comparing "+str4+" and "+str5+" : "+str4.equalsIgnoreCase(str5));//Ignore case
    }
}
