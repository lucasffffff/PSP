package ej1;

/**
 *
 * @author lucas
 */
import java.util.Random;

class MyThread extends Thread {

    private int numero;

    public MyThread(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hilo " + numero + " | Iteracion " + i);
            try {
                int tiempoEspera = new Random().nextInt(1000); // Tiempo de espera aleatorio
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
