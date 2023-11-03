
package ej2;

/**
 *
 * @author usuario
 */
class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + threadNumber + ": Iteracion " + i);
            try {
                Thread.sleep(1000); // bloquear el hilo durante 1seg
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
