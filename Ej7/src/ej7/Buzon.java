
package ej7;

/**
 *
 * @author lucas
 */
public class Buzon {

    private String mensaje = null;

    public synchronized void escribir(String mensaje) throws InterruptedException {
        while (this.mensaje != null) {
            wait();
        }
        this.mensaje = mensaje;
        notifyAll(); // notifyAll para notificar a todos los hilos esperando
    }

    public synchronized String lectura(String nombre) throws InterruptedException {
        while (this.mensaje == null) {
            wait();
        }
        String mensajeLeido = this.mensaje;
        this.mensaje = null;
        notifyAll(); // notifyAll para notificar a todos los hilos esperando
        return mensajeLeido;
    }
}
