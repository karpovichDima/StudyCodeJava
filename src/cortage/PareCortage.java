package cortage;

// Статический метод, который возвращает определенный тип данных

/*Чтобы использовать кортеж, надо просто определить объект с нужной
* длинной, как возвращаемое значение функции, затем создать и
* возвращать его в команде return*/

class Amphibian{}
class Vehicle{}

public class PareCortage {

    public static class TwoTuple<A,B>{
        final A first;
        final B second;

        TwoTuple(A a, B b) {
           first = a; second = b;
        }
        public String toString(){
            return "(" + first + ", " + second + ")";
        }
    }
    public static class ThreeTuple<A,B,C> extends TwoTuple<A,B>{
        final C third;

        ThreeTuple(A a, B b, C c) {
            super(a, b);
            third = c;
        }

        public String toString(){
            return "(" + first + ", " + second + "," + third + ")";
        }
    }
    public static class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C>{
        final D fourth;

        FourTuple(A a, B b, C c, D d) {
            super(a, b, c);
            fourth = d;
        }

        public String toString(){
            return "(" + first + ", " + second + "," + third + "," + fourth + ")";
        }
    }
    public static class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D>{
        final E fifth;

        FiveTuple(A a, B b, C c, D d, E e) {
            super(a, b, c, d);
            fifth = e;
        }

        public String toString(){
            return "(" + first + ", " + second + "," + third + "," + fourth + "," + fifth + ")";
        }
    }

    private static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("hi", 47);
    }
    private static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }
    private static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }
    private static FiveTuple<Vehicle,Amphibian,String,Integer,Double>k(){
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
