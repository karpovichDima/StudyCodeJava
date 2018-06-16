package tree_set;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Collection<String> collection = new TreeSet<>();
        collection.add("2");
        collection.add("3");
        collection.add("1");
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
