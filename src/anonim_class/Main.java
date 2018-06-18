package anonim_class;

class Popcorn{
    void  doSomething(){
        System.out.println("popcorn");
    }

    void secondMethod(){
        System.out.println("second");
    }
}

public class Main {
    public static void main(String[] args) {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        comparable.compareTo(new Object());
    }

    static void method(Popcorn popcorn){
        popcorn.doSomething();
    }
}
