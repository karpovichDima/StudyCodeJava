package hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    static class Book {
        String nameAuthor;

        public Book(String nameAuthor) {
            this.nameAuthor = nameAuthor;
        }

        @Override
        public String toString() {
            return "Book{" + "nameAuthor ='" +
                    nameAuthor + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        Map<String, Object> collection = new HashMap<>();
        collection.put("1", "Dan Brown");
        collection.put("2", new Book("Karnegi"));
        collection.put("3", "Jack London");

        // Перебор всех ключей и значений
        Set set = collection.entrySet();
        for(Object o : set) {
            System.out.println(o);
        }

        // Перебор всех ключей
        Set keySet = collection.keySet();
        for(Object o : keySet) {
            System.out.println(o);
        }
    }
}
