package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private String fechaRegistro;
    private boolean lineaCredito;
    private static int contadorCliente;
    
    public Cliente(String nombre, String fechaRegistro, boolean lineaCredito){
        super(nombre);
        this.idCliente =  ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.lineaCredito = lineaCredito;
    }

    public int getIdCliente() {
        return this.idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getFechaRegistro() {
        return this.fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public boolean isLineaCredito() {
        return this.lineaCredito;
    }
    public void setLineaCredito(boolean lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", lineaCredito=").append(lineaCredito);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
