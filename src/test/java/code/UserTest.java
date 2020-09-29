package code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class UserTest {
    User emptyUser;
    private User user;
    private List<Fraction> listFractionsTest;

    @BeforeEach
    void before(){

        List<Fraction> listFractions = new ArrayList<>();
        listFractionsTest = new ArrayList<>();
        listFractions.add(new Fraction(1,1));
        listFractions.add(new Fraction(1,2));

        listFractionsTest.add(new Fraction(1,1));
        listFractionsTest.add(new Fraction(1,2));
        listFractionsTest.add(new Fraction(1,2));

        emptyUser= new User();
        user = new User("0D","Diego","Lusquiños", listFractions);
        user.addFraction(new Fraction(1,2));
    }

    @Test
    void testToString(){
        String textToString = "User{" +
                "id='" + this.user.getId() + '\'' +
                ", name='" + this.user.getName() + '\'' +
                ", familyName='" + this.user.getFamilyName() + '\'' +
                ", fractions=" + this.user.getFractions() +
                '}';
        assertEquals(textToString,this.user.toString());

    }
     @Test
     void testGetId(){
         assertEquals("0D",this.user.getId());
     }

    @Test
    void testEmptyConstructor(){
        assertEquals(emptyUser.getFractions().size(),0);
    }

    @Test
    void testGetName(){
        assertEquals("Diego",this.user.getName());
    }
    @Test
    void testSetName(){
        this.user.setName("New");
        assertEquals("New",this.user.getName());
    }


    @Test
    void testGetFamilyName(){
        assertEquals("Lusquiños",this.user.getFamilyName());
    }

    @Test
    void testGetFractionList(){
        assertEquals(this.listFractionsTest,this.user.getFractions());
    }

    @Test
    void testSetFractions(){
        this.user.setFractions(this.listFractionsTest);
        assertEquals(this.listFractionsTest,this.user.getFractions());
    }

    @Test
    void addFraction(){
        assertEquals(3,this.user.getFractions().size());
    }

    @Test
    void testFullName(){
        assertEquals("Diego Lusquiños",this.user.fullName());
    }

    @Test
    void testSetFamilyName(){
        this.user.setFamilyName("New");
        assertEquals("New",this.user.getFamilyName());
    }

    @Test
    void initials(){
        assertEquals("D.",this.user.initials());
    }




}
