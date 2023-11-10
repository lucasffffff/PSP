
public class FibonacciThread extends Thread {

    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int[] fibSequence = new int[n];
        fibSequence[0] = 1;
        fibSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }

        System.out.print("Los primeros " + n + " numeros de la secuencia de Fibonacci son: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibSequence[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Cambio el valor de N al número 
        int N = 10;
        FibonacciThread fibThread = new FibonacciThread(N);

        // Aquí inicio el hilo
        fibThread.start();

        try {
            // Esto espera a que termine el hilo
            fibThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nHilo terminado.");
    }
}
