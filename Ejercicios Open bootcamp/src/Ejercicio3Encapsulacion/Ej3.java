
package Ejercicio3Encapsulacion;


public class Ej3 {
     public static void main(String[] args){
     Persona persona1 = new Persona();
     persona1.setNombre("Marcelo");
     persona1.setEdad("25");
     persona1.setTelefono("11223456");
     System.out.println("Nombre: "+persona1.getNombre());
     System.out.println("Edad: "+persona1.getEdad());
     System.out.println("Telefono: "+persona1.getTelefono());
     
     }
    
}
