
package ej3;

/**
 *
 * @author lucas
 */

public class MyThread extends Thread {
    
    private final int contador;
    private static final int MIN_SLEEP = 100;
    private static final int MAX_SLEEP = 600;
    
    public MyThread(String name, int contador){
        super(name);
        this.contador = contador;
    }
    
    @Override
    public void run() {
        System.out.println("Soy el hilo: " + getName());
        
        if (contador == Integer.parseInt(getName())) {
            performThreadActions();
        } else {
            String nextThreadName = String.valueOf(Integer.parseInt(getName()) + 1);
            MyThread nextThread = new MyThread(nextThreadName, contador);
            nextThread.start();
            
            performThreadActions();
            
            try {
                nextThread.join();
            } catch (InterruptedException ex) {
                System.out.println("Error join");
            }
        }
        
        System.out.println("Fin del hilo: " + getName());
    }
    
    private void performThreadActions() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * (MAX_SLEEP - MIN_SLEEP) + MIN_SLEEP));
                System.out.println("Thread " + getName() + ": " + i);
            } catch (InterruptedException ex) {
                System.out.println("Error sleep");
            }
        }
    }
}
