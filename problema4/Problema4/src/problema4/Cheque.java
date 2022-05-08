
package problema4;


public class Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    
    public Cheque() {
        nombreCliente = "Nombre Cliente";
        nombreBanco = "Nombre banco";
    }
    
    public Cheque(String nom, String ban, double val) {
        nombreCliente = nom;
        nombreBanco = ban;
        valorCheque = val;
    }
    
    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }
    
    public void establecerNombreBanco(String x) {
        nombreBanco = x;
    }
    
    public void establecerValorcheque(double x) {
        valorCheque = x;
    }
    
    public void calcularComisionl() {
        comision = (valorCheque * 0.003)/ 100;
    }
    
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public String obtenerNombreBanco() {
        return nombreBanco;
    }
    
    public double obtenerValorcheque() {
        return valorCheque;
    }
    
    public double obtenerComsiion() {
        return comision;
    }
    
    public String toString() {
        String cadena = String.format(
                "Nombre del Cliente: %s\n" 
              + "Nombre del Banco: %s\n"
              + "Valor del Cheque: %.2f\n"
              + "Comision del Banco: %.2f\n", nombreCliente,
              nombreBanco, valorCheque, comision);
        return cadena;
    }
}
