package com.batalla;

/**
 * Clase principal: crea criaturas y simula batallas entre ellas.
 * Usa polimorfismo: simularBatalla trabaja con el tipo genérico Criatura.
 */
public class Main {

    /**
     * Simula una batalla por turnos entre dos criaturas hasta que una muera.
     * Muestra el resultado de cada ataque y la salud actual de ambas.
     * @return la criatura ganadora
     */
    public static Criatura simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("=== BATALLA: " + criatura1.getNombre() + " vs " + criatura2.getNombre() + " ===");
        int turno = 1;

        while (criatura1.estaViva() && criatura2.estaViva()) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Ataca la criatura 1 (el método llamado depende del tipo real: polimorfismo)
            criatura1.atacar(criatura2);
            System.out.println("  Salud -> " + criatura1.getNombre() + ": " + criatura1.getSalud()
                    + " | " + criatura2.getNombre() + ": " + criatura2.getSalud());

            // Contraataca la criatura 2 solo si sigue viva
            if (criatura2.estaViva()) {
                criatura2.atacar(criatura1);
                System.out.println("  Salud -> " + criatura1.getNombre() + ": " + criatura1.getSalud()
                        + " | " + criatura2.getNombre() + ": " + criatura2.getSalud());
            }
            turno++;
        }

        Criatura ganadora = criatura1.estaViva() ? criatura1 : criatura2;
        System.out.println("\n>>> Resultado final: ¡" + ganadora.getNombre() + " gana la batalla con "
                + ganadora.getSalud() + " de salud!\n");
        return ganadora;
    }

    public static void main(String[] args) {
        // Batalla 1: Dragón vs Guerrero
        Criatura dragon = new Dragon("Drogon", 120, 12, "Escamas de fuego");
        Criatura guerrero = new Guerrero("Conan", 150, 15, "Espada");
        simularBatalla(dragon, guerrero);

        // Batalla 2: Mago vs Guerrero (criaturas nuevas)
        Criatura mago = new Mago("Merlín", 100, 18, "Bola de fuego");
        Criatura guerrero2 = new Guerrero("Aragorn", 130, 14, "Hacha");
        simularBatalla(mago, guerrero2);

        // Batalla 3: Dragón vs Mago
        Criatura dragon2 = new Dragon("Smaug", 110, 10, "Escamas de oro");
        Criatura mago2 = new Mago("Gandalf", 105, 16, "Rayo arcano");
        simularBatalla(dragon2, mago2);
    }
}
