package es.upm.miw.iwvg_devops.code;

public class Searches {

    public Double findFirstDecimalFractionByUserName(String name){
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal)
                .findFirst()
                .orElse(null);
    }
    public Fraction findFractionDivisionByUserId(String id){
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::division)
                .orElse(null);
    }

}
