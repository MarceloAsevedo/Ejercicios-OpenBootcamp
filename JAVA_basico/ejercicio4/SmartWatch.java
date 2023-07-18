
package JAVA_basico.ejercicio4;

class SmartWatch extends SmartDevice {
    private boolean resisteAlAgua;

    public SmartWatch() {
        
    }

    public SmartWatch(String mar, String mod, int bat, boolean res) {
        super(mar, mod, bat);
        this.resisteAlAgua = res;
    }

    public boolean getResisteAlAgua() {
        return resisteAlAgua;
    }
}
