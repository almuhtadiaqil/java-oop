package util;

import data.NotBlank;
import error.BlankException;
import data.LoginRequest;
import error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.Username() == null) {
            throw new NullPointerException("Username tidak boleh kosong");
        } else if (loginRequest.Username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.Password() == null) {
            throw new NullPointerException("Password tidak boleh kosong");
        } else if (loginRequest.Password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.Username() == null) {
            throw new NullPointerException("Username tidak boleh kosong");
        } else if (loginRequest.Username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.Password() == null) {
            throw new NullPointerException("Password tidak boleh kosong");
        } else if (loginRequest.Password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    public static void validationReflection(Object o) {
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(o);
                    if(value == null || value.isBlank()){
                        throw new BlankException("Field "+field.getName()+" is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }

    }
}
