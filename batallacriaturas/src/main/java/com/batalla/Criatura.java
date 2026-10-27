package com.batalla;

/**
 * Clase abstracta Criatura.
 * Define los atributos y el comportamiento común de todas las criaturas.
 * Las subclases deben implementar atacar() y defender().
 */
public abstract class Criatura {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private int salud;
    private int fuerza;

    /**
     * Constructor de la criatura.
     * @param nombre nombre de la criatura
     * @param salud  puntos de salud iniciales
     * @param fuerza fuerza base usada para calcular el daño
     */
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    // ---------- Métodos abstractos ----------

    /** Permite a esta criatura atacar a otra (cada subclase ataca distinto). */
    public abstract void atacar(Criatura objetivo);

    /** Permite a esta criatura defenderse de un ataque (cada subclase defiende distinto). */
    public abstract void defender(int daño);

    // ---------- Método concreto ----------

    /** Indica si la criatura sigue viva (salud > 0). */
    public boolean estaViva() {
        return salud > 0;
    }

    // ---------- Getters y setters ----------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    /** La salud nunca baja de 0. */
    public void setSalud(int salud) {
        this.salud = Math.max(0, salud);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
}
