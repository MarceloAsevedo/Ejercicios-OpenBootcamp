
public class EstructurasDecontrol {
   
    public static void main(String[] args) {
        int numeroIf = 5;
        int numeroWhile = 0;
        int numeroFor = 0;
        int estacion = 2; // 1 - Primavera, 2 - Verano, 3 - Otoño, 4 - Invierno
        
        // If
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
        
        // While
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor del número en el bucle While: " + numeroWhile);
        }
        
        // Do While
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Valor del número en el bucle Do While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);
        
        // For
        for (int i = 0; i <= 3; i++) {
            System.out.println("Valor del número en el bucle For: " + i);
        }
        
        // Switch
        switch (estacion) {
            case 1:
                System.out.println("Estamos en Primavera");
                break;
            case 2:
                System.out.println("Estamos en Verano");
                break;
            case 3:
                System.out.println("Estamos en Otoño");
                break;
            case 4:
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("El valor de la variable estacion no corresponde a ninguna estación");
                break;
        }
    }
}

