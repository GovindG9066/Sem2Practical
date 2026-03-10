package Mar_10;

import java.util.ArrayList;

public class lambdafunArrayList {
    public static void main(String[] args) {
        ArrayList <String> arr1=new ArrayList<String>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        arr1.add("E");
        arr1.add("F");

        arr1.forEach(x-> System.out.println(x));

    }
}
