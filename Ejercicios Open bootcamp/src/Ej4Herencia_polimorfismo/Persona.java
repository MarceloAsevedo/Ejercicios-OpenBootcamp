
package Ej4Herencia_polimorfismo;


abstract class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

   
    public abstract void mostrarInformacion();
}
