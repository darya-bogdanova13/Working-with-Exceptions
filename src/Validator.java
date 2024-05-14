import Exception.WrongLoginException;
import Exception.WrongPasswordException;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9.]{1,20}");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9.]{1,20}");

    public static void validate(
            String login,
            String password,
            String confirmPassword
    ) {

        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Логин не соответствует");

        }

         if(!PASSWORD_PATTERN.matcher(password).matches()) {
            throw new WrongPasswordException("Пароль не соответсвтует");

        }
             if(!password.equals(confirmPassword)) {
                 throw new WrongPasswordException("Пароль не совпадает");

             }
    }
}