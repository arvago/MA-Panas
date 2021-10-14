package beans;

public class Habitacion {
    private String name;
    private Boolean booked;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Boolean getBooked(){
        return this.booked;
    }
    
    public void setBooked(Boolean isBooked){
        this.booked = isBooked;
    }
}
