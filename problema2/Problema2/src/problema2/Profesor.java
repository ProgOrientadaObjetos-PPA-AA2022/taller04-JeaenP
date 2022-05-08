
package problema2;


public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesor() {
        nombre  = "Profesor x";
        apellido = "Profesor x";
        sueldoBasico = 465;
        cedula = "xxxxxxxxxx";
    }
    
    public Profesor(String nom, String ape, double sb, String ced) {
        nombre  = nom;
        apellido = ape;
        sueldoBasico = sb;
        cedula = ced;
    }
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerApellido(String x) {
        apellido = x;
    }
    
    public void establecerSueldoBasico(double x) {
        sueldoBasico = x;
    }
    
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico * 1.2;
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotoal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public String toString() {
        String cadena = String.format(
                "Nombre: %s\n" 
              + "Apellido: %s\n"
              + "Sueldo Basico: %.2f\n"
              + "Sueldo Total: %.2f\n"
              + "Cedula: %s\n", nombre,
              apellido, sueldoBasico, sueldoTotal, cedula);
        return cadena;
    }
           
}
