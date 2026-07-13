package ng.ourChemo.data.models;

public class User {
    private String password;
    private String username;
    private String fullName;
    private int id;

    public void setId(Long id) {
    }

    public int getId() {
        return 0;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getID(){
        return id;
    }



}
