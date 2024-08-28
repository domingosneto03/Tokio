package tokio;

public class Rectangle {
    private int base;
    private int altura;

    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Rectangle() {
        this.base = 2;
        this.altura = 1;
    }

    public void esquadria(int base, int altura) {
        if(base == altura) System.out.println("É um quadrado");
        else System.out.println("Não é um quadrado");
    }

    public void area(int base, int altura) {
        int res = base * altura;
        System.out.println("Area do retângulo: " + res);
    }

    public void perimetro(int base, int altura) {
        int res = 2*base + 2*altura;
        System.out.println("Perímetro do retângulo: " + res);
    }

    public void gira(int base, int altura) {
        int temp = altura;
        altura = base;
        base = temp;
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}
