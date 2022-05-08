
package problema3;


public class Ejecutor {

    
    public static void main(String[] args) {
        Automotor a1 = new Automotor();
        Automotor a2 = new Automotor("1150038147", "Chevrolet", 2004, 18000);
        a1.calcularValorMatricula();
        a2.calcularValorMatricula();
        System.out.printf("%s\n", a1);
        System.out.printf("%s\n", a2);
    }
    
}
