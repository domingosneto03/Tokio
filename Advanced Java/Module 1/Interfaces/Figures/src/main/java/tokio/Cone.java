package tokio;

public class Cone extends Figura implements FiguraCircular3D{
    private double altura;
    private double raio;

    public Cone(double x, double y, double altura, double raio) {
        super(x, y);
        this.altura = altura;
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
        return (area() * altura)/3;
    }
}
