package Mar_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperations {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Radha");
        m.put(2,"Radhika");
        m.put(2,"Krishnavallabha");
        m.put(4,"Vrinndavnewari");

        Set<Integer> keys=m.keySet();
        Iterator<Integer> itr=keys.iterator();

        while (itr.hasNext()){
            int key= itr.next();
            String value=m.get(key);
            System.out.println(key + " " + value);
        }
    }
}
