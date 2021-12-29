public class PasswordValidation {

    public static void validate(String pw) {
        String pattern = "^(?=.*[0-9])(?=.*[A-Z, a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        System.out.println(pw.matches(pattern));
    }

}
