package main.java.homework6;

public class LoginPassCheck {

    static boolean isValid (String loginPass){
        if (loginPass.length()<20||!loginPass.matches(("[0-9a-zA-Z_]*"))||loginPass==null){
            return false;
        }
        else
            return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static boolean checkLoginInfo(String login, String password, String passConfirmation) {
        try {
            if (!isValid(login)) {
                throw new WrongLoginException();

            } else if (!isValid(password)) {
                throw new WrongPasswordException();
            } else if (password.equals(passConfirmation)
            ) ;

        } catch (WrongLoginException e) {
            System.out.println(e.wrongValidation());
        }

        catch (WrongPasswordException e) {
            System.out.println(e.wrongValidation());
        }
        return true;
    }

    }



