package Chapter11b_Interfaces;

public class Customer {
    public static void main(String[] args) {
        Product book=new Book();
        book.setPrice(34.78);
        System.out.println(book.getPrice());
    }
}
