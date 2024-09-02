package chapter6_class;

public class ch6_classMathod {
    private double length;
    private double width;
    //String s = (String) tip When you need to cast an expression value to the required type, use Type-Matching completion. For example, type
    //String s = (
    //and press Ctrl+Shift+Space to see what happens.
    //To view all exit points of a method, place the caret at one of them, for example the return statement, and press Ctrl+Shift+F7:
    public ch6_classMathod(){
        length = 0;
        width = 0;
    }

    public ch6_classMathod(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way. these are only different here to demo alternative options
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
