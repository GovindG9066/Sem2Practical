package Mar_10;

import java.util.ArrayList;
import java.util.Iterator;

public class twoListOperation {
    public static void main(String[] args) {
        var l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        var l2=new ArrayList<Integer>();
        l2.addAll(l1);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);

        Iterator<Integer> itr2=l2.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }




    }
}
