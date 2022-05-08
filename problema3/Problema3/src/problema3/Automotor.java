package problema3;

public class Automotor {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor() {
        cedulaDuenio = "XXXXXXXXXX";
        marcaVehiculo = "Marca";
        anioFabricacion = 2000;
    
    }
    
    public Automotor(String ced, String marca, int anio, double val) {
        cedulaDuenio = ced;
        marcaVehiculo = marca;
        anioFabricacion = anio;
        valorVehiculo = val;
    
    }
    
    public void establecerCedula(String x) {
        cedulaDuenio = x;
    }
    
    public void establecerMarca(String x) {
        marcaVehiculo = x;
    }
    
    public void establecerAnio(int x) {
        anioFabricacion = x;
    }
    
    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }
    
    public void calcularValorMatricula() {
        valorMatricula = ((valorVehiculo * 0.002)/100) * (2022 - anioFabricacion);
    }   
    
    public String obtenerCedula() {
        return cedulaDuenio;
    }
    
    public String obtenerMarca() {
        return marcaVehiculo;
    }
    
    public int obtenerAnio() {
        return anioFabricacion;
    }
    
    public double obtenerValorVehculo() {
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(
                "Ceula del Dueño: %s\n" 
              + "Marca del Vehiculo: %s\n"
              + "Año de Fabricaicon: %d\n"
              + "Valor del Vehiculo: %.2f\n"
              + "Valor de la Matricula: %.2f\n", cedulaDuenio,
              marcaVehiculo, anioFabricacion, valorVehiculo, valorMatricula);
        return cadena;
    }
    
}
