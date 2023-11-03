package ej6;

/**
 *
 * @author lucas
 */
public class HiloIngresoDinero extends Thread {

    private Dinero cuenta;
    private int dinero;

    public HiloIngresoDinero(Dinero cuenta, int dinero) {
        this.cuenta = cuenta;
        this.dinero = dinero;
    }

    @Override
    public void run() {
        cuenta.setDinero(cuenta.getDinero() + dinero);
        System.out.println("Se han ingresado " + dinero + "€, ahora el saldo es de: " + cuenta.getDinero() + "€.");
    }
}
