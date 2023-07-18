
package JAVA_basico.ejercicio4;


public class SmartPhone extends SmartDevice {
    private String numero;

    public SmartPhone() {
        // Constructor vacío
    }

    public SmartPhone(String mar, String mod, int bat, String nro) {
        super(mar, mod, bat);
        this.numero = nro;
    }

    public String getNumero() {
        return numero;
    }
}

