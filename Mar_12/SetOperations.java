package Mar_12;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(5);
        l1.add(5);
        l1.add(9);

        l2.add("Govind");
        l2.add("Sanket");
        l2.add("Om");
        l2.add("Sanket");
        l2.add("Govind");
        System.out.println("This is the List :");
        System.out.println(l1);
        System.out.println(l2);

        Set<Integer>s1=new HashSet<>(l1);
        Set<String>s2=new HashSet<>(l2);
        System.out.println("This is the List converted into Set...And remove duplicate");
        System.out.println(s1);
        System.out.println(s2);
    }
}
