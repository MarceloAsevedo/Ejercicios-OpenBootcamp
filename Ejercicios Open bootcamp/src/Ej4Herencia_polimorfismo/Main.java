
package Ej4Herencia_polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(35, "Roberto", "112234567", 12333.50);
        cliente.mostrarInformacion();

        System.out.println();

      
        Trabajador trabajador = new Trabajador(32, "José", "44444333222", 65221.30);
        trabajador.mostrarInformacion();
    }
}