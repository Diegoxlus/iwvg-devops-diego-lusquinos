package code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class FractionTest {
    private Fraction fraction;
    private Fraction fraction2;
    private Fraction fraction3;

    @BeforeEach
    void before(){
        fraction = new Fraction(2,3);
        fraction2 = new Fraction(2,2);
        fraction3 = new Fraction(1,6);
    }

    @Test
    void testFractionIsProper(){
        assertEquals(true,fraction.isProper());
    }

    @Test
    void testFractionIsImProper(){
        assertEquals(false,fraction.isImproper());
    }

    @Test
    void testFractionIsEquivalent(){
        assertEquals(false,fraction.isEquivalent(fraction2));
        assertEquals(true,fraction.isEquivalent(fraction));
    }

    @Test
    void testAdd(){
        assertEquals(new Fraction(10,6),fraction.add(fraction2));
        assertEquals(new Fraction(5,6),fraction.add(fraction3));
    }

    @Test
    void testMultiply(){
        assertEquals(new Fraction(4,6),fraction.multiply(fraction2));
        assertEquals(new Fraction(2,18),fraction.multiply(fraction3));
    }

    @Test
    void testDivide(){
        assertEquals(new Fraction(4,6),fraction.divide(fraction2));
        assertEquals(new Fraction(12,3),fraction.divide(fraction3));
    }

    @Test
    void testEquals(){
        assertEquals(fraction, new Fraction(2, 3));
        assertNotEquals(fraction, fraction3);
    }

    @Test
    void testHashCode(){
        assertEquals(fraction.hashCode(), new Fraction(2, 3).hashCode());
        assertNotEquals(fraction.hashCode(), fraction3.hashCode());
    }

     @Test
     void testToString(){
        String textToString = "Fraction{" +
                "numerator=" + fraction.getNumerator() +
                ", denominator=" + fraction.getDenominator() +
                '}';

         assertEquals(textToString,fraction.toString());

     }






}
