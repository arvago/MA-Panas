package dominio;

public class Ticket {
    private int idTicket;
    private String topic;
    private String description;
    private String area;
    private int status;
    private int idUserU;
    private int idUserA;
    private int priority;
    
     public Ticket(){
        
    }
    
    public Ticket(int idTicket){
        this.idTicket = idTicket;
    }
    
    public Ticket(String topic, String description, String area, int status, int idUserU, int idUserA, int priority){
        this.topic = topic;
        this.description = description;
        this.area = area;
        this.status = status;
        this.idUserU = idUserU;
        this.idUserA = idUserA;
        this.priority = priority;
    }
    
    public Ticket(int idTicket, String topic, String description, String area, int status, int idUserU, int idUserA, int priority){
        this.idTicket = idTicket;
        this.topic = topic;
        this.description = description;
        this.area = area;
        this.status = status;
        this.idUserU = idUserU;
        this.idUserA = idUserA;
        this.priority = priority;
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

    public int getIdUserU() {
        return idUserU;
    }

    public void setIdUserU(int idUserU) {
        this.idUserU = idUserU;
    }

    public int getIdUserA() {
        return idUserA;
    }

    public void setIdUserA(int idUserA) {
        this.idUserA = idUserA;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", topic=" + topic + ", description=" + description + ", area=" + area + ", status=" + status + ", idUserU=" + idUserU + ", idUserA=" + idUserA + ", priority=" + priority + '}';
    }      
}
