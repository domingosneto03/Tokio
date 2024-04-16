package tokio;

public class Media {
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia(double nota1, double nota2, double nota3) {
        double sum = nota1 + nota2 + nota3;
        return sum / 3;
    }
}
