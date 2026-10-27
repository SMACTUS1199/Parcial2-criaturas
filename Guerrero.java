/**
 * Guerrero: ataca con su arma (daño = fuerza)
 * y se defiende bloqueando con el escudo, que absorbe parte del daño.
 */
public class Guerrero extends Criatura {

    private String arma; // arma del guerrero (ej. "Espada")

    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " (Guerrero) ataca con su " + arma + " y causa " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int reduccion = 3; // el escudo absorbe 3 puntos
        int danoReal = Math.max(1, daño - reduccion);
        setSalud(getSalud() - danoReal);
        System.out.println("  " + getNombre() + " bloquea con su escudo y recibe " + danoReal
                + " de daño. Salud: " + getSalud());
    }

    public String getArma() {
        return arma;
    }
}
