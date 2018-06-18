package reflection;

import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        // Способы работы с классом
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        System.out.println(clss.getName());

        // Получение конструкторов, и параметров к ним
        System.out.println("");
        System.out.println("Construktors: ");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }

        // Получение методов и их параметров
        System.out.println("");
        System.out.println("Methods");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
            // даем доступ к private методам
            method.setAccessible(true);
            // запуск заданного метода, с передачей параметров
            method.invoke(someClass, "test");
        }
        // получаем доступ к полям
        System.out.println("");
        System.out.println("fields");
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true);
            System.out.println(field.getInt(someClass));
            field.setInt(someClass, 5);
            System.out.println(field.getInt(someClass));
        }

    }
}
   class SomeClass {
    private  int i;

    public SomeClass(){
    }

    SomeClass(String s){
        //this.s = s;
    }

    private synchronized String someMethod(String s){
        System.out.println("this is " + s);
        return s;
    }
   }