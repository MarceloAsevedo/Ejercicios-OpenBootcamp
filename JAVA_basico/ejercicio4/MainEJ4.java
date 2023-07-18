
package JAVA_basico.ejercicio4;

public class MainEJ4 {
    
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone 12", 80, "123456789");
        SmartWatch watch = new SmartWatch("Samsung", "Galaxy Watch 3", 90, false);

        System.out.println("SmartPhone:");
        System.out.println("Marca: " + phone.getMarca());
        System.out.println("Modelo: " + phone.getModelo());
        System.out.println("Bateria: " + phone.getBateria());
        System.out.println("Número: " + phone.getNumero());

        System.out.println("");

        System.out.println("SmartWatch:");
        System.out.println("Marca: " + watch.getMarca());
        System.out.println("Modelo: " + watch.getModelo());
        System.out.println("Bateria: " + watch.getBateria());
        System.out.println("Resistente al agua: " + watch.getResisteAlAgua());
    }
}

