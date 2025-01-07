package Chapter_Constructor2_Udemy;

public class thisKeyword {
    int a=2;
     public  void getData(){
         int a=3;
         int b=this.a+a;  // this key refers to current obj, obj scope lies  in the class
         System.out.printf("b: "+b);
         System.out.printf("a:"+a);
         System.out.printf("this.a:"+this.a);
     }

    public static void main(String[] args) {
       thisKeyword tk=new thisKeyword();
       tk.getData();
    }
}
