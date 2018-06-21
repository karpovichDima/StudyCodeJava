package encryption;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class RSA {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String s = "hello world";
        System.out.println("До шифрования: " + s);

        Cipher cipher = Cipher.getInstance("RSA");

        KeyPairGenerator pairGen = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = pairGen.generateKeyPair();
        Key publicKey = keyPair.getPublic();
        Key privateKey = keyPair.getPrivate();

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] bytes = cipher.doFinal(s.getBytes());
        System.out.print("После шифрования: ");
        for (byte b : bytes){
            System.out.print(b);
        }
        System.out.println("\n");

        Cipher descriptCipher = Cipher.getInstance("RSA");
        descriptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] descryptedBytes = descriptCipher.doFinal(bytes);
        System.out.print("После дешифрования: ");
        for (byte b : descryptedBytes){
            System.out.print((char) b);
        }
    }
}
