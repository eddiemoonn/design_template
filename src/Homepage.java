//home page class
//i am adding this comment to indicate that i am changing the branch in homepage
public abstract class Homepage {
    String Username;
    String password;
    String signup;
    String Social_media;
    String Menu;
    Homepage(){}

    public boolean post(String message) {
        if (logIn(this.Username, this.password)) {
            // Send the post data.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}



