package sha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Helper {

    public static String generateHash(String data) {

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(data.getBytes("UTF-8"));
            StringBuilder hexadecimalString  = new StringBuilder();
            for(int i = 0; i<hash.length; i++){
                String hexadecimal = Integer.toHexString(0xff&hash[i]);
                if (hexadecimal.length() == 1) hexadecimalString.append('0');
                hexadecimalString.append(hexadecimal);
            }

            return hexadecimalString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
