package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rational!");
        Rational num1 = new Rational(3,8);
        Rational num2 = new Rational(4, 5);
        System.out.println("Soma:");
        num1.sum(num2.getNumerador(), num2.getDenominador());
        System.out.println("Subtração:");
        num1.subtraction(num2.getNumerador(), num2.getDenominador());
        System.out.println("Multiplicação:");
        num1.multiplication(num2.getNumerador(), num2.getDenominador());
        System.out.println("Divisão:");
        num1.division(num2.getNumerador(), num2.getDenominador());

    }
}