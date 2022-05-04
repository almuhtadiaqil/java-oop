package data;

public record LoginRequest(String Username, String Password) {
    public LoginRequest{
        System.out.println("Membuat object Login Request");
    }

    public LoginRequest(String Username){
        this(Username,"");
    }
    public LoginRequest(){
        this("","");
    }

    public void sayHello(){
        System.out.println("Hello " + this.Username);
    }

}
