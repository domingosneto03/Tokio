package tokio;

public class Rational {
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Rational(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void sum(int c, int d) {
        int num = numerador*d + denominador*c;
        int den = denominador*d;
        System.out.println("Result: " + num + "/" + den);
    }

    public void subtraction(int c, int d) {
        int num = numerador*d - denominador*c;
        int den = numerador*d;
        System.out.println("Result: " + num + "/" + den);
    }

    public void multiplication(int c, int d) {
        int num = numerador*c;
        int den = denominador*d;
        System.out.println("Result: " + num + "/" + den);
    }

    public void division(int c, int d) {
        int num = numerador*d;
        int den = denominador*c;
        System.out.println("Result: " + num + "/" + den);
    }
}
