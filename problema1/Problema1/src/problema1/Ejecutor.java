
package problema1;


public class Ejecutor {

   
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Juan", 7, 8, 9);
        e1.calcularPromedio();
        e2.calcularPromedio();
        System.out.printf("%s\n", e1);
        System.out.printf("%s\n", e2);
    }
    
}
