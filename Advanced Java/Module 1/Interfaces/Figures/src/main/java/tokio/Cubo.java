package tokio;

public class Cubo extends Figura implements Figuras3D{

    private double aresta;

    public Cubo(double x, double y, double aresta) {
        super(x, y);
        this.aresta = aresta;
    }

    @Override
    public double area() {
        return Math.pow(aresta, 2);
    }

    @Override
    public double volume() {
        return Math.pow(aresta, 3);
    }
}
