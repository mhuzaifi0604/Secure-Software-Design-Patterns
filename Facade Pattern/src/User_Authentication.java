public class User_Authentication {
    private String username;
    private String password;

    public User_Authentication(String user, String pass){
        this.username = user;
        this.password = pass;
    }
    public void Authenticate(){
        System.out.println("User authenticated\n Username: " + username + ", Password: "+ password);
    }
}
