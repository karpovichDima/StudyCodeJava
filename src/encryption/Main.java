package encryption;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        String str = "hello world";

        System.out.println(md5(str));
        System.out.println(sha1(str));
    }

    private static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(input.getBytes( "UTF-8" ));
            StringBuilder sb = new StringBuilder();
            for (byte anArray : array) {
                sb.append(String.format("%02x", anArray));
            }
            return sb.toString();
        } catch ( NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return null;
        }

    }

    private static String sha1(String input) {
        String sha1 = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(input.getBytes("UTF-8"), 0, input.length());
            sha1 = DatatypeConverter.printHexBinary(md.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ignored) {
            return null;
        }
        return sha1;
    }
}
