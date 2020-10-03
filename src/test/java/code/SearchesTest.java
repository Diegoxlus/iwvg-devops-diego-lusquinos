package code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SearchesTest {
    @Test
    void findFirstDecimalFractionByUserName(){
        assertEquals(2.0/1, new Searches().findFirstDecimalFractionByUserName("Ana"));
        assertEquals(0.0/1, new Searches().findFirstDecimalFractionByUserName("Oscar"));
    }

    @Test
     void findFractionDivisionByUserId(){
        assertEquals(new Fraction(0,2), new Searches().findFractionDivisionByUserId("1"));
        assertEquals(new Fraction(8,8), new Searches().findFractionDivisionByUserId("4"));
        assertEquals(new Fraction(-48,60), new Searches().findFractionDivisionByUserId("3"));
    }

    @Test
     void findFractionSubtractionByUserName(){
        assertEquals(new Fraction(0,-6), new Searches().findFractionSubtractionByUserName("Antonio"));
        assertEquals(new Fraction(22,60), new Searches().findFractionSubtractionByUserName("Ana"));

    }

}
