//login page
////i am adding this comment to indicate that i am changing the branch in log-in class
public class login_page extends Homepage {
    public login_page(String Username, String password){
        this.Username = Username;
        this.password = password;
    }
    public boolean login (String Username, String password){
        System.out.println("Enter Username" + this.Username);
        System.out.println("Enter password");
        for (int x = 0; x < this.password.length(); x++){
            System.out.println(".");
        }
        System.out.println("Welcome");
        return true;
    }

}
