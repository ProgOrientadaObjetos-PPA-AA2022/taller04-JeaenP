
package problema1;


public class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
 
    public Estudiante() {
        nombre = "Estudiante";
        nota1 = 10;
        nota2 = 10;
        nota3 = 10;
    }
    
    public Estudiante(String nom, double n1, double n2, double n3) {
        nombre = nom;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    
    
    public void establecerNombre(String x) {
        nombre = x;
    }
    
    public void establecerNota1(double x) {
        nota1 = x;
    }
    
    public void establecerNota2(double x) {
        nota2 = x;
    }
    
    public void establecerNota3(double x) {
        nota3 = x;
    }
    
    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3)/3;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public double obtenerNota1() {
        return nota1;
    }
    
    public double obtenerNota2() {
        return nota2;
    }
    
    public double obtenerNota3() {
        return nota3;
    }
    
    public double obtenerPromedio() {
        return promedio;
    }
    
    public String toString() {
        String cadena = String.format(
                "Nombre: %s\n" 
              + "Nota 1: %.2f\n"
              + "Nota 2: %.2f\n"
              + "Nota 3: %.2f\n"
              + "Promedio: %.2f\n", nombre,
              nota1, nota2, nota3, promedio);
        return cadena;
    }
    
}
