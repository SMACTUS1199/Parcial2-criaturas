
package com.batalla;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void debeAtacarConSuFuerza() {
        Mago mago = new Mago("Merlín", 100, 10, "Bola de fuego");
        Guerrero objetivo = new Guerrero("Caballero", 100, 5, "Espada");

        mago.atacar(objetivo);

        assertEquals(93, objetivo.getSalud());
    }

    @Test
    void debeReducirElDañoConLaBarreraMagica() {
        Mago mago = new Mago("Merlín", 100, 10, "Bola de fuego");

        mago.defender(10);

        assertEquals(93, mago.getSalud());
    }

    @Test
    void debeSeguirVivoSiTieneSalud() {
        Mago mago = new Mago("Merlín", 100, 10, "Bola de fuego");

        assertTrue(mago.estaViva());
    }
}
