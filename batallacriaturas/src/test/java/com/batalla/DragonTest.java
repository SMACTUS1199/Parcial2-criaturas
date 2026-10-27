
package com.batalla;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void debeAtacarConElDobleDeFuerza() {
        Dragon dragon = new Dragon("Fuego", 100, 10, "Escamas de fuego");
        Guerrero objetivo = new Guerrero("Caballero", 100, 5, "Espada");

        dragon.atacar(objetivo);

        assertEquals(83, objetivo.getSalud());
    }

    @Test
    void debeReducirCuatroPuntosAlDefenderse() {
        Dragon dragon = new Dragon("Fuego", 100, 10, "Escamas de fuego");

        dragon.defender(10);

        assertEquals(94, dragon.getSalud());
    }

    @Test
    void debeSeguirVivoSiTieneSalud() {
        Dragon dragon = new Dragon("Fuego", 100, 10, "Escamas de fuego");

        assertTrue(dragon.estaViva());
    }
}

