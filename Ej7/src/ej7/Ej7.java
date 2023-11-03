
package ej7;

/**
 *
 * @author lucas
 */
public class Ej7 {

    public static void main(String[] args) {
        Buzon buzon = new Buzon();

        MyThread hiloEsc1 = new MyThread("Enviar", "Buenos dias, Lucas", buzon);
        MyThread hiloLec1 = new MyThread("Lectura", null, buzon);
        MyThread hiloEsc2 = new MyThread("Enviar", "Buenas noches, Feliu", buzon);
        MyThread hiloLec2 = new MyThread("Lectura2", null, buzon);

        hiloEsc1.start();
        hiloLec1.start();
        hiloEsc2.start();
        hiloLec2.start();
    }
}
