package dominio;

public class Compra {
    private int idCompra;
    private int idCliente;
    private String producto;
    private double saldo;

    public Compra() {
    }

    public Compra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Compra(int idCliente, String producto, double saldo) {
        this.idCliente = idCliente;
        this.producto = producto;
        this.saldo = saldo;
    }

    public Compra(int idCompra, int idCliente, String producto, double saldo) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.producto = producto;
        this.saldo = saldo;
    }
    
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setproducto(String producto) {
        this.producto = producto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idCliente=" + idCliente + ", producto=" + producto + ", saldo=" + saldo + '}';
    }

    
    
}
