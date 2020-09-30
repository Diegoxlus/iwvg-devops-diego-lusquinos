package code;

import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    @Test
    void findFirstDecimalFractionByUserName(){
        assertEquals(2.0/1, new Searches().findFirstDecimalFractionByUserName("Ana"));
        assertEquals(0.0/1, new Searches().findFirstDecimalFractionByUserName("Oscar"));

    }

}
