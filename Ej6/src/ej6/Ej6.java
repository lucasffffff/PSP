package ej6;

/**
 *
 * @author lucas
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ej6 {

    public static void main(String[] args) {
        try {
            Dinero cuenta = new Dinero(100); // Inicializa la cuenta con 100€

            for (int i = 0; i < 5; i++) {
                HiloIngresoDinero ingreso35 = new HiloIngresoDinero(cuenta, 35);
                ingreso35.start();
                ingreso35.join();

                HiloIngresoDinero ingreso20 = new HiloIngresoDinero(cuenta, 20);
                ingreso20.start();
                ingreso20.join();

                HiloSacarDinero retirada12 = new HiloSacarDinero(cuenta, 12);
                retirada12.start();
                retirada12.join();
            }

            System.out.println("Dinero: " + cuenta.getDinero() + "€");
        } catch (InterruptedException ex) {
            Logger.getLogger(Ej6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
