package Mar_10;


import java.util.HashSet;
import java.util.Iterator;

public class SetOperations {
    public static void main(String[] args) {
        HashSet <Integer> hset=new HashSet<>();
        hset.add(45);
        hset.add(85);
        hset.add(63);
        hset.add(32);

        System.out.println("Iteratate with Iterator...");
        Iterator <Integer> itr = hset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Size of the Hashset Is :"+hset.size());
        System.out.println(hset.contains(45));
        System.out.println(hset.stream().count());

        System.out.println("Iterator using lambda function...");

        hset.forEach(x-> System.out.println(x));
    }
}
