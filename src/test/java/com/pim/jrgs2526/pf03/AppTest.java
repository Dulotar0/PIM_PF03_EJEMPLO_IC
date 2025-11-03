package com.pim.jrgs2526.pf03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @ParameterizedTest
    @ValueSource(int = { 5,6,7,8,9,10 })
    public void testCalcularAprobado(int nota) {
        App main = new App();
        int resultado = main.calcularNota(nota);
        Assertions.assertEquals(1, resultado);
    }

    @ParameterizedTest
    @ValueSource(int = { 0,1,2,3,4 })
    public void testCalcularSuspenso(int nota) {
        App main = new App();
        int resultado = main.calcularNota(nota);
        Assertions.assertEquals(-1, resultado);
    }

    @Test
    public void testCalcularError() {
        App main = new App();
        try {
            int resultado = main.calcularNota(63);
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals("Error al calcular nota", e.getMessage());
            return;
        }
        Assertions.fail();
    }
}
