package encryption;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AES {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String s = "hello world";

        System.out.println("До шифрования: " + s);

        Cipher cipher = Cipher.getInstance("AES");

        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        SecretKey key = kgen.generateKey();

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] bytes =  cipher.doFinal(s.getBytes());
        System.out.print("После шифрования: ");
        for (byte b : bytes){
            System.out.print(b);
        }
        System.out.println("\n");

        Cipher descriptrCipher = Cipher.getInstance("AES");

        descriptrCipher.init(Cipher.DECRYPT_MODE, key);

        byte[] descriptedByte = descriptrCipher.doFinal(bytes);

        System.out.print("После дешифрования: ");
        for (byte b : descriptedByte){
            System.out.print((char) b);
        }

    }
}
