
package problema2;


public class Ejecutor {

    public static void main(String[] args) {
        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor("Carlos", "Vega", 1200, "1150038147");
        p1.calcularSueldoTotal();
        p2.calcularSueldoTotal();
        System.out.printf("%s\n", p1);
        System.out.printf("%s\n", p2);
    }
    
}
