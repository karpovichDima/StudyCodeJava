package hash_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> collection = new HashSet<>();

        // Добавляет в коллекцию только уникальные элементы

        collection.add("1");
        collection.add("1");
        collection.add("2");
        collection.add("1");
        collection.add("3");
        collection.add("2");
        collection.add("3");

        for (Object O : collection){
            System.out.println(O);
        }
    }
}
