package com.batalla;

/**
 * Dragón: tiene un ataque más fuerte (fuerza * 2)
 * y se defiende con sus escamas, que absorben parte del daño.
 */
public class Dragon extends Criatura {

    private String escamas; // tipo de escamas (ej. "Escamas de fuego")

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2; // ataque doble
        System.out.println(getNombre() + " (Dragón) lanza una llamarada y causa " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int reduccion = 4; // las escamas absorben 4 puntos
        int danoReal = Math.max(1, daño - reduccion);
        setSalud(getSalud() - danoReal);
        System.out.println("  " + getNombre() + " se protege con sus " + escamas
                + " y recibe " + danoReal + " de daño. Salud: " + getSalud());
    }

    public String getEscamas() {
        return escamas;
    }
}
