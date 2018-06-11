public class Generics {
    public static void main(String[] args) {
        CustomArrayList<String> strings = new CustomArrayList<>();

        for(int i = 0; i < 100; i++){
            strings.add("Hello world " + i);
        }

        for(int i = 0; i < strings.getLength(); i++){
            System.out.println(strings.get(i));
        }

        function(42);
        function("Hello world");
    }

    static <GENERIC_TYPE> void function(GENERIC_TYPE parameter){
        System.out.println(parameter.toString());
    }
}
