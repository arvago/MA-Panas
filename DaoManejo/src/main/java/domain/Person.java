
package domain;


//Identity Class that has a representation in the DB
public class Person {
    private int idPerson;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    //EJ Bean
    public Person() {
    }
    

    //For delete a record
    public Person(int idPerson) {
        this.idPerson = idPerson;
    }

    
    //For Create a record
    public Person(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
    

    //Update record
    public Person(int idPerson, String name, String lastName, String email, String phone) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    
    public int getIdPerson() {
        return this.idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
    
    
    
    
    
    
    
}
