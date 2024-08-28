package tokio;

public class PoligonoRegular extends Figura implements Figura2D{
    private final int lados;
    private double comprimento;
    private double apotema;

    public int getLados() {
        return lados;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public PoligonoRegular(double x, double y, int lados, double comprimento, double apotema) {
        super(x, y);
        this.lados = lados;
        this.comprimento = comprimento;
        this.apotema = apotema;
    }

    @Override
    public double area() {
        double p = perimetro();
        return 0.5 * p * apotema;
    }

    @Override
    public double perimetro() {
        return comprimento * lados;
    }
}
