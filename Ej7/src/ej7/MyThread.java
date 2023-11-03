
package ej7;

/**
 *
 * @author lucas
 */
public class MyThread extends Thread {

    private String nombre;
    private String cadena;
    private Buzon buzon;

    public MyThread(String nombre, String cadena, Buzon buzon) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.buzon = buzon;
    }

    public void run() {
        if (nombre.equals("Enviar")) {
            try {
                buzon.escribir(cadena);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                String mensajeLeido = buzon.lectura(nombre);
                System.out.println(nombre + ": " + mensajeLeido);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
