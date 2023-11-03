
package ej1;

/**
 *
 * @author lucas
 */
public class Ej1 {
    public static void main(String[] args) {
        MyThread hilo1 = new MyThread(1);
        MyThread hilo2 = new MyThread(2);

        hilo1.start();
        hilo2.start();
    }
}
