package tokio;

public class Tuba extends Sopro{
    @Override
    String tocar(String nota) {
        return soprar(nota);
    }

    private String soprar(String nota) {
        return("soprar... Tuba (nota " + nota + ")");
    }
}
