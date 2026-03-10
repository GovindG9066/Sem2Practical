package Mar_10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
//        ArrayList <Integer> l1=new ArrayList <>();
//        l1.add(5);
//        l1.add(10);
//        l1.add(15);
//
//        System.out.println(l1);
//
//        Iterator <Integer> itr=l1.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
////            System.out.println();
//        }

    List<String> l2=new ArrayList<>();
    l2.add("Mango");
    l2.add("Banana");
    l2.add("Apple");
    l2.add("Cheery");
    l2.addFirst("greeps");
    l2.removeLast();

    System.out.println(l2);
    l2.remove("Mango");

//    Iterator <String> itr1=l2.iterator();
//    while (itr1.hasNext()){
//        System.out.println(itr1.next());
//    }
        l2.forEach(x-> System.out.println(x));

    }
}
