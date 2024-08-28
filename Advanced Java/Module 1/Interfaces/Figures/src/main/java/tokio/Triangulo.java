package tokio;

public class Triangulo extends Figura implements Figura2D{
    private final String tipo;
    private double base;
    private double altura;

    public Triangulo(double x, double y, String tipo, double base, double altura) {
        super(x, y);
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return 0.5 * base * altura;
    }

    @Override
    public double perimetro() {
        if(tipo.equals("equilatero")) return base * 3;
        else if(tipo.equals("isosceles")) {
            double semiBase = base/2;
            double hip = Math.sqrt(Math.pow(semiBase, 2) + Math.pow(altura,2));
            return hip * 2 + base;
        }
        else {
            double hip = Math.sqrt(Math.pow(base, 2) + Math.pow(altura,2));
            return base + altura + hip;
        }
    }
}
