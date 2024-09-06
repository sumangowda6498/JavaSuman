package Chapter11b_Interfaces;

public interface Product {
 double getPrice();
 void setPrice(double Price);

 String getName();
 void setName(String name);

 String getColor();
 void setColor(String color);

default String Barcode(){
 return "no Barcode";
}

}
