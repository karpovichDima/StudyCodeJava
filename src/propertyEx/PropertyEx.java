package propertyEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyEx {
    public static void main(String[] args) {

        Properties propertiesQ = new Properties();
        propertiesQ.setProperty("one", "1");
        System.out.println(propertiesQ.getProperty("one"));
        // Создаем и записываем в файл
        try {
            FileOutputStream out = new FileOutputStream("my.properties");
            propertiesQ.store(out, "my commets");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Читаем из файла
        try {
            FileInputStream in = new FileInputStream("my.properties");
            propertiesQ.load(in);
            System.out.println(propertiesQ.getProperty("Dima"));
            System.out.println(propertiesQ.getProperty("beacon"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
