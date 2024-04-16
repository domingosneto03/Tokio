package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Complex Numbers!");
        ComplexNumber c1 = new ComplexNumber(25.80, 3.40);
        ComplexNumber c2 = new ComplexNumber(5, 10);
        ComplexNumber c3 = new ComplexNumber(2, 2);
        System.out.println("Somar:");
        somar(c1,c2);
        somar(c2,c3);
        somar(c1,c3);
        System.out.println("Subtrair:");
        subtrair(c1,c2);
        subtrair(c2,c1);
        subtrair(c3,c3);
    }

    public static ComplexNumber somar(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.real + c2.real;
        double imaginary = c1.imaginary + c2.imaginary;
        ComplexNumber res = new ComplexNumber(real, imaginary);
        if(res.imaginary < 0) System.out.println("Result: (" + res.real + " - " + Math.abs(res.imaginary) + "i)");
        else System.out.println("Result: (" + res.real + " + " + res.imaginary + "i)");
        return res;
    }

    public static ComplexNumber subtrair(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.real - c2.real;
        double imaginary = c1.imaginary - c2.imaginary;
        ComplexNumber res = new ComplexNumber(real, imaginary);
        if(res.imaginary < 0) System.out.println("Result: (" + res.real + " - " + Math.abs(res.imaginary) + "i)");
        else System.out.println("Result: (" + res.real + " + " + res.imaginary + "i)");
        return res;
    }
}