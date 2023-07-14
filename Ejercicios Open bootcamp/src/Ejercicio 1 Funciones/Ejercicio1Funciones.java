
public class Ejercicio1Funciones {

    public static int sumaTresNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public static void main(String[] args) {
        int resultado = sumaTresNumeros(2, 3, 5);
        System.out.println("La suma de los tres números es: " + resultado);
        
        ClaseChocheEj1 miCoche = new ClaseChocheEj1();
        miCoche.incrementarPuertas();
        
        System.out.println("El número de puertas del coche es: " + miCoche.getNumPuertas());
    }
}
    

