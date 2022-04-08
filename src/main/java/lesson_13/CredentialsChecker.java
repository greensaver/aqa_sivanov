package lesson_13;

import lesson_13.exceptions.WrongLoginException;
import lesson_13.exceptions.WrongPasswordException;

public class CredentialsChecker {
    public static boolean Check(String login, String password, String confirmPassword){
        try{
            ValidateLogin(login);
            ValidatePassword(password,confirmPassword);
            return true;
        }
        catch (WrongPasswordException wrongPasswordException)
        {
            System.out.println(wrongPasswordException.title);
            return false;
        }
        catch (WrongLoginException wrongLoginException)
        {
            System.out.println(wrongLoginException.title);
            return false;
        }
    }

    private static void ValidatePassword (String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword))
        throw new WrongPasswordException("Password and confirmation password must be equal");
        if (!password.contains("_")||!password.contains("!")|| password.length()>=20)
            throw new WrongPasswordException("Password doesn't match the rules");
    }

    private static void ValidateLogin(String login) throws WrongLoginException{
        if (!login.contains("_") || login.length()>=20) {
            throw new WrongLoginException("Login doesn't match the rules");
        }
    }
}
