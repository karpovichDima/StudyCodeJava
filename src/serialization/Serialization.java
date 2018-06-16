package serialization;

import java.io.*;

public class Serialization {

    public static class User implements Serializable {
        int lifeLevel;
        Sord sord;
    }

    public static class Sord implements Serializable {
        int level;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User();
        user.lifeLevel = 55;
        Sord sord = new Sord();
        sord.level = 5;
        user.sord = sord;

        // Запись user life level в tempFile
        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        // Чтение
        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream);
        User newUser = (User)  objectInputStream1.readObject();
        objectInputStream1.close();

        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.sord.level);

        // Static поля лучше не сериализовать
    }
}
