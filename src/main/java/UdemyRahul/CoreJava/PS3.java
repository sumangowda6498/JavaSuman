package UdemyRahul.CoreJava;

public class PS3 //147 Usage of Super keyword in constructor to passvalue to Parent class
{

    int a;

    public PS3(int a) {
        this.a=a;
    }

    public int multiplytwo(){
        a=a*2;
        return a;
    }

    public int multiplyThree(){
        a=a*3;
        return a;
    }
}
