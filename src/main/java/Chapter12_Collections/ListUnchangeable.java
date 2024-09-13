package Chapter12_Collections;

import java.util.List;

public class ListUnchangeable {
    public static void main(String[] args) {

        List unchangeableList =List.of("apple","banana","lemon");

       // unchangeableList.add("orenge"); //UnsupportedOperationException
        unchangeableList.remove("banana"); //UnsupportedOperationException

    }
}
