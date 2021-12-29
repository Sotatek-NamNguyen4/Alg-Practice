import java.security.SecureRandom;

public class RandomString {

    static final String SOURCE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    static SecureRandom secureRnd = new SecureRandom();

    static void getRndStr() {
        String rndStr = null;
        do {
            rndStr = RandomString.randomStr(12);
        } while (rndStr.matches("^(?=.*[0-9])")); // ".*\d.*" with !
        System.out.println(rndStr);
    }

    public static String randomStr(int length) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            str.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length())));
        }
        return str.toString();
    }

}
