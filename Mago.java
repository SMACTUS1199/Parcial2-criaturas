/**
 * Mago: ataca con hechizos (daño = fuerza)
 * y se defiende con una barrera mágica que reduce el daño un 30%.
 */
public class Mago extends Criatura {

    private String hechizos; // hechizo principal (ej. "Bola de fuego")

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " (Mago) lanza el hechizo " + hechizos + " y causa " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int danoReal = Math.max(1, (int) Math.round(daño * 0.7)); // barrera mágica
        setSalud(getSalud() - danoReal);
        System.out.println("  " + getNombre() + " crea una barrera mágica y recibe " + danoReal
                + " de daño. Salud: " + getSalud());
    }

    public String getHechizos() {
        return hechizos;
    }
}
