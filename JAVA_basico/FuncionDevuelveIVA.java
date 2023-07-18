
package JAVA_basico;

public class FuncionDevuelveIVA {
    public static void main(String[] args) {
    
    
    double precio = 100.0;
        double precioFinal = devolveIVA(precio);
        System.out.println("El precio con IVA es: " + precioFinal);
    
    
    }
    
    
    public static double devolveIVA (double p){
    double iva = p * 1.21;
    return iva;
    
    }
    
    
    
}
