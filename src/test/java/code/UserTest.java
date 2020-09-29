package code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    private List<Fraction> listFractions;

    @BeforeEach
    void before(){
        listFractions = new ArrayList<>();
        listFractions.add(new Fraction(1,1));
        listFractions.add(new Fraction(1,2));
        user = new User("0D","Diego","Lusquiños",listFractions);
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


}
