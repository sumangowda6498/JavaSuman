package GeekForGeek;

public class RemoveleadingZerofromString {
    public static void main(String[] args) {
       String number="0000163783";
        number=removezero(number);

        System.out.println(number);
    }
    public static String removezero(String str){
        int i=0;
        while (i<str.length() && str.charAt(i) =='0'){
            i++;
        }


        // Converting string into StringBuffer object
        // as strings are immutable
        StringBuffer sb = new StringBuffer(str);

        sb.replace(0,i,"");

        return sb.toString();
    }
}
