/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexerciciouri;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 253746
 */
public class Testes {

    public Testes() {
    }


    @Test
    public void testarSoma() {
        TesteExercicioUri uri=new TesteExercicioUri();
        assertEquals(13954, uri.soma(100, 200));
    }
    @Test
    public void testarSomaPrimeiroNumeroMaiorSegundo(){
     TesteExercicioUri uri=new TesteExercicioUri();
    assertEquals(13954, uri.soma(200, 100));
    }
    @Test
    public void testarReversao(){
            TesteExercicioUri uri=new TesteExercicioUri();
        assertEquals(0, uri.reverterSoma(100, 200));
    }
}
