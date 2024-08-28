package tokio;

public class Circulo extends Figura implements FiguraCircular2D{
    private double raio;

    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return Math.pow(raio, 2) * Math.PI;
    }

    @Override
    public double perimetro() {
        return 2 * raio * Math.PI;
    }
}
