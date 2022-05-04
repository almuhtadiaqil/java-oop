package app;

import error.ValidationException;
import data.LoginRequest;
import util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("aqil","null");

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println(e.getMessage());
        }   finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Success");
    }
}
