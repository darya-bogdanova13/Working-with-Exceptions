import Exception.WrongLoginException;
import Exception.WrongPasswordException;
public class Main {
    public static void main(String[] args) {
        String login = "darya";
        String password = "1234";
        String confirmPassword = "1234";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException Exception) {
            Exception.printStackTrace();
        } finally {
            System.out.println("Верно");
        }
    }
}