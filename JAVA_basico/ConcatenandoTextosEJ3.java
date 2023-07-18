
package JAVA_basico;


public class ConcatenandoTextosEJ3 {
   
    public static void main(String[] args) {
        String[] nombres = {"Roberto", "José", "Marcelo"};
        String resultado = "";
        
        for (String nombre : nombres) {
            resultado += nombre + " ";
        }
        
        System.out.println(resultado); 
    }

    
}
