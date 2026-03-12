package Feb_12;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(5);
        l1.add(5);
        l1.add(9);
        System.out.println("This is the List :");
        System.out.println(l1);

        Set<Integer>s1=new HashSet<>(l1);
        System.out.println("This is the List converted into Set...And remove duplicate");
        System.out.println(s1);
    }
}
