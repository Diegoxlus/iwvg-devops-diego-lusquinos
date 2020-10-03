package es.upm.miw.iwvg_devops.code;

public class Searches {

    public Double findFirstDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal)
                .findFirst()
                .orElse(null);
    }

    public Fraction findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::divide)
                .orElse(null);
    }

    public Fraction findFractionSubtractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .limit(1)
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::substraction)
                .orElse(null);
    }

    public Fraction findFractionAdditionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .limit(1)
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::add)
                .orElse(null);
    }

}
