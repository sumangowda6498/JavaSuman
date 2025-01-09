package Variables;

public class StaticVarible {
    String name;//Instance variable
    String address;//Instance variable
    static String city="Bengalore";// class variable
    static int i=0;// class variable
    int j=0;


    static String Pin;
    static int k;
    static {//static bloc: used to intailize value to static var inside this block
        Pin="574241";
        k=9;
    }


    public StaticVarible(String name, String address) {//constructor
        this.name=name;
        this.address=address;
      //  this.city=City;
        i++;
        j++;
        System.out.println(i);
        System.out.println("j ="+j);
    }
    public void getAddress(){
        System.out.println(address);
        System.out.println(city);
    }

    public static void getCity(){ //static methods cannot be called using the objects; (st1, st2)
        System.out.println(city);
    }

    public static void main(String[] args) {
        StaticVarible st1=new StaticVarible("Ram","Marathalli");
        StaticVarible st2=new StaticVarible("Sam","Richmond");
           st1.getAddress();
           st2.getAddress();


        System.out.println("STATIC VAR & METHOD");
           getCity();
           //or
           StaticVarible.getCity();//both way works

        st2.address="BCROAD";
        st2.getAddress();
    }
}
