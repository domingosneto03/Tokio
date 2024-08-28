package tokio;

abstract class Figura {
    private double x;
    private double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y) {
        this.x += x;
        this.y += y;
    }

    abstract double area();

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
