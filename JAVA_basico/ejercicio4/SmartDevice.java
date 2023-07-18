
package JAVA_basico.ejercicio4;

public class SmartDevice {
    protected String marca;
    protected String modelo;
    protected int bateria;

    public SmartDevice() {
       
    }

    public SmartDevice(String mar, String mod, int bat) {
        this.marca = mar;
        this.modelo = mod;
        this.bateria= bat;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public int getBateria() {
        return bateria;
    }
}
