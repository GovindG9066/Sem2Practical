package Mar_10;

import java.util.ArrayList;

public class UsingVarInstedArraylist {
    public static void main(String[] args) {
        var cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("Farari");
        cars.add("Mastang gt");

        cars.forEach(car-> System.out.println(car));
    }
}
