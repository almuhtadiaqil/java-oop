package app;

import data.CreateUserRequest;
import util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("aqil");
        request.setPassword("Rahasia@1");
        ValidationUtil.validationReflection(request);
    }
}
