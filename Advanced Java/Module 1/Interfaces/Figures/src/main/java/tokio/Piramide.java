package tokio;

public class Piramide extends Figura implements Figuras3D{
    private double altura;
    private int lados;
    private double apotema;
    private double base;
    private double alturaSup;

    // piramide poligono
    public Piramide(double x, double y, double altura, int lados, double apotema, double base) {
        super(x, y);
        this.altura = altura;
        this.lados = lados;
        this.apotema = apotema;
        this.base = base;
    }

    // piramide quadrangular
    public Piramide(double x, double y, double altura, double base) {
        super(x,y);
        this.altura = altura;
        this.lados = 4;
        this.base = base;
    }

    // piramide triangular
    public Piramide(double x, double y, double altura, double base, double alturaSup) {
        super(x, y);
        this.altura = altura;
        this.lados = 3;
        this.base = base;
        this.alturaSup = alturaSup;
    }

    @Override
    public double area() {
        switch (lados) {
            case 3 -> {
                Triangulo face = new Triangulo(0, 0, "equilatero", base, alturaSup);
                return face.area();
            }
            case 4 -> {
                Quadrado face = new Quadrado(0, 0, base);
                return face.area();
            }
            default -> {
                PoligonoRegular face = new PoligonoRegular(0, 0, lados, base, apotema);
                return face.area();
            }
        }
    }

    @Override
    public double volume() {
        return (area() * altura)/3;
    }
}
