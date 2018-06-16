package compare;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{

    private int age;

    Person(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    public String toString(){
        return "Person {" + "age" + age + '}';
    }
}

public class sort {
    public static void main(String[] args) {
        Set<Object> set = new TreeSet<>();

        set.add(new Person(4));
        set.add(new Person(6));
        set.add(new Person(5));
        set.add(new Person(2));

        for (Object o : set){
            System.out.println(o);
        }

    }
}
