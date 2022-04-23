package test.grafos;

import grafos.GrafoVecinos;
import org.junit.Test;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** 
* GrafoVecinos Tester. 
* 
* @author <Martin>
* @since <pre>abr. 17, 2022</pre> 
* @version 1.0 
*/ 
public class GrafoVecinosTest {
    GrafoVecinos grafo;

@Before
    public void before() throws Exception {
    this.grafo = new GrafoVecinos(8);
    grafo.agregarVecino(2,5, 10);
    grafo.agregarVecino(7,1, 4);
    grafo.agregarVecino(3,4, 1);
}

@Test
    public void testContieneVecino(){

    assertTrue(grafo.contieneVecino(2,5));
    assertTrue(grafo.contieneVecino(7,1));
    assertTrue(grafo.contieneVecino(3,4));
}

@Test
    public void testPesoArista(){
        assertEquals(10, grafo.pesoArista(2,5));
    }

} 