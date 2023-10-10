package ar.edu.uade.adoo.ejemplos.patrones.prototype;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArbolTest {
    private List<Arbol> bosque;

    @Before
    public void setearValoresIniciales() {
        this.bosque = new ArrayList<>();
        this.bosque.add(new Araucaria(10, 20));
        this.bosque.add(new Pino(6, 20));
    }
    @Test
    public void copiaArbol() {
        // Dado (given)
        Arbol araucaria = new Araucaria(0, 0);
        // Cuando (when)
        // Creo 100 copias de araucarias
        for (int i = 0; i < 100; i++) {
            this.bosque.add(araucaria.copiar());
        }
        // Entonces (then)
        // 100 copias de araucarias deberian encontrarse en la misma posicion
        assertEquals(100L, this.bosque.stream().filter(copia -> copia.enMismaPosicion(araucaria)).count());
    }
}
