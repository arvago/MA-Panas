package dominio;

public class User {
    private int idUser;
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String role;
    
    public User(){
        
    }
    
    public User(int idUser){
        this.idUser = idUser;
    }
    
    public User(String name, String lastName, String username, String password, String role){
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public User(int idUser, String name, String lastName, String username, String password, String role){
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", name=" + name + ", lastName=" + lastName + ", username=" + username + ", password=" + password + ", role=" + role + '}';
    } 
}

