package ej6;

/**
 *
 * @author lucas
 */
public class HiloSacarDinero extends Thread {

    private Dinero cuenta;
    private int dinero;

    public HiloSacarDinero(Dinero cuenta, int dinero) {
        this.cuenta = cuenta;
        this.dinero = dinero;
    }

    @Override
    public void run() {
        cuenta.setDinero(cuenta.getDinero() - dinero);
        System.out.println("Retirada de " + dinero + "€, quedan: " + cuenta.getDinero() + "€" + "en la cuenta.");
    }
}
