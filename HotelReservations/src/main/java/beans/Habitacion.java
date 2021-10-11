package beans;

public class Habitacion {
    private String name;
    private Boolean isBooked;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Boolean getBooked(){
        return this.isBooked;
    }
    
    public void setBooked(Boolean isBooked){
        this.isBooked = isBooked;
    }
}
