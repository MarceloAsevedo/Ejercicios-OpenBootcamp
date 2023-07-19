
package JAVA_basico;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save() invocado");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll() invocado");
    }

    @Override
    public void delete() {
        System.out.println("Método delete() invocado");
    }
}