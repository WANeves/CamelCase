import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wellingtonalvesdasneves on 6/12/16.
 */
public class TestCamelCase {
    @Test
    public void toLowerCase(){
        CamelCase camelCase = new CamelCase();
        String s = camelCase.toLowerCase("NOME EE");
        assertEquals("nome ee", s);
    }

    @Test
    public void toUpperCase(){
        CamelCase camelCase = new CamelCase();
        String s = camelCase.toUpperCase("nome sobrenome");
        assertEquals("NOME SOBRENOME", s);
    }

}
