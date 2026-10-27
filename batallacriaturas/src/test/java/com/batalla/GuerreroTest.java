
package com.batalla;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuerreroTest {

    @Test
    void debeAtacarConSuFuerza() {
        Guerrero guerrero = new Guerrero("Thor", 100, 10, "Espada");
        Mago objetivo = new Mago("Merlín", 100, 5, "Rayo");

        guerrero.atacar(objetivo);

        assertEquals(93, objetivo.getSalud());
    }

    @Test
    void debeReducirTresPuntosAlDefenderse() {
        Guerrero guerrero = new Guerrero("Thor", 100, 10, "Espada");

        guerrero.defender(10);

        assertEquals(93, guerrero.getSalud());
    }

    @Test
    void noDebeTenerSaludNegativa() {
        Guerrero guerrero = new Guerrero("Thor", 5, 10, "Espada");

        guerrero.defender(100);

        assertEquals(0, guerrero.getSalud());
        assertFalse(guerrero.estaViva());
    }
}
