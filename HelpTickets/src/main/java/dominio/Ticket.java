package dominio;

public class Ticket {
    private int idTicket;
    private String topic;
    private String description;
    private String area;
    private int status;
    
     public Ticket(){
        
    }
    
    public Ticket(int idTicket){
        this.idTicket = idTicket;
    }
    
    public Ticket(String topic, String description, String area, int status){
        this.topic = topic;
        this.description = description;
        this.area = area;
        this.status = status;
    }
    
    public Ticket(int idTicket, String topic, String description, String area, int status){
        this.idTicket = idTicket;
        this.topic = topic;
        this.description = description;
        this.area = area;
        this.status = status;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", topic=" + topic + ", description=" + description + ", area=" + area + ", status=" + status + '}';
    }
}
