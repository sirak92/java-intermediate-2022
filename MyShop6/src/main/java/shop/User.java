package shop;

public class User {

    private final String userName;
    private final String password;

    public final String name;

    private   final int userID;

    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        userID = this.userName.hashCode() * this.password.hashCode();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    public int getUserID() {
        return userID;
    }

    @Override
    public int hashCode() {
        return userName.hashCode() * password.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return (((User) obj).userName.equals(this.userName) && ((User) obj).password.equals(this.password));
    }
}
