package beans;

public class Habitacion {
    private int id;
    private boolean booked= true;
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public boolean getBooked(){
        return this.booked;
    }
    
    public void setBooked(boolean booked){
        this.booked = booked;
    }
}
