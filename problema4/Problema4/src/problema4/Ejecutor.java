
package problema4;

public class Ejecutor {

    public static void main(String[] args) {
        Cheque c1 = new Cheque();
        Cheque c2 = new Cheque("Jose Martinez", "Banco de Guayaquil", 2000);
        c1.calcularComisionl();
        c2.calcularComisionl();
        System.out.printf("%s\n", c1);
        System.out.printf("%s\n", c2);
    }
}
