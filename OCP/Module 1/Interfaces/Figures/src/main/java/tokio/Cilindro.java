package tokio;

public class Cilindro extends Figura implements FiguraCircular3D{
    private double raio;
    private double altura;

    public Cilindro(double x, double y, double raio, double altura) {
        super(x, y);
        this.raio = raio;
        this.altura = altura;
    }


    @Override
    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        Circulo sup = new Circulo(0,0,raio);
        return sup.area();
    }

    @Override
    public double volume() {
        return 2 * area() * altura;
    }
}
