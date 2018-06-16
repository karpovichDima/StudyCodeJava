package compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{

    int age;

    Person(int age){
        this.age = age;
    }

    public String toString(){
        return "Person {" + "age" + age + '}';
    }
}

class ComparePerson implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}

public class sort {
    public static void main(String[] args) {

        ComparePerson comparePerson = new ComparePerson();
        Set<Person> set = new TreeSet<>(comparePerson);

        set.add(new Person(4));
        set.add(new Person(6));
        set.add(new Person(5));
        set.add(new Person(2));

        for (Object o : set){
            System.out.println(o);
        }

    }
}
