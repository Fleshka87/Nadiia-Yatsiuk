package main.java.homework6;

public class WrongLoginException extends Exception{

    public String wrongValidation ()
    {
       return  "The login should contain number, latin symbols and '_' symbol or the login should be more than 20 symbol";

    }
}
