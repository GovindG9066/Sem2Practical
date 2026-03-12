package Mar_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BharatKaNaksha {
    public static void main(String[] args) {
        List<String> MH=new ArrayList<>();
        MH.add("Baramati");
        MH.add("Pune");

        List<String> UP=new ArrayList<>();
        UP.add("City1");
        UP.add("City2");

        Map<Integer,List<String>> m=new HashMap<>();
        m.put(1,MH);
        m.put(2,UP);

//        System.out.println(m);
        m.forEach((x,y)-> System.out.println(x+ " " + y));





    }
}
