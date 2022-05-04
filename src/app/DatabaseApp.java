package app;

import error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
