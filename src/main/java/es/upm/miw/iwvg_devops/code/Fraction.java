package es.upm.miw.iwvg_devops.code;
/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper(){
        return this.numerator<this.denominator;
    }

    public boolean isImproper(){
        return this.numerator>this.denominator;
    }

    public boolean isEquivalent(Fraction fraction){
        return this.numerator*fraction.denominator == this.denominator*fraction.numerator;
    }

    public Fraction add(Fraction fraction){
        int newDenominator = mcm(this.denominator,fraction.denominator);
        int newNumerator = (newDenominator/this.denominator*this.numerator)+(newDenominator/fraction.denominator*fraction.numerator);
        return new Fraction(newNumerator,newDenominator);
    }

    private int mcm(int number1, int number2){
        int mcm = 0;
        int numMax = Math.max(number1,number2);
        int numMin = Math.min(number1,number2);
        mcm = (numMax/mcd(numMax,numMin))*numMin;
        return mcm;
    }

    public  int mcd(int num1, int num2) {
        int mcd = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }


        public Fraction multiply(Fraction f){
        return new Fraction(this.numerator*f.numerator, this.denominator*f.denominator);
    }

    public Fraction division(Fraction f){
        return new Fraction(this.numerator*f.denominator, this.denominator*f.numerator);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return denominator * 31 + numerator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    Fraction substraction(Fraction fraction) {
        int newDenominator = mcm(this.denominator,fraction.denominator);
        int newNumerator = (newDenominator/this.denominator*this.numerator)-(newDenominator/fraction.denominator*fraction.numerator);
        return new Fraction(newNumerator,newDenominator);
    }
}
