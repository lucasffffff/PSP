
package ej2;

/**
 *
 * @author lucas
 */
public class Ej2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[4];

        for (int i = 0; i < 4; i++) {
            threads[i] = new MyThread(i + 1);
            threads[i].start();
        }

        // Esperar a que los hilos terminen
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Los hilos han acabado.");
    }
}
