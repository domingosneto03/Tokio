package tokio;

public class Esfera extends Figura implements FiguraCircular3D{
    private double raio;

    public Esfera(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        Circulo sup = new Circulo(0,0, raio);
        return sup.area();
    }

    @Override
    public double volume() {
        return (4 * Math.PI * Math.pow(raio, 3))/3;
    }
}
