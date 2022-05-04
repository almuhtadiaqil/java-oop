package app;

import data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Aqil", "Rahasia@1");

        System.out.println(loginRequest);
        System.out.println(loginRequest.Username());
        System.out.println(loginRequest.Password());
        System.out.println(loginRequest.hashCode());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Ujang"));
    }
}
