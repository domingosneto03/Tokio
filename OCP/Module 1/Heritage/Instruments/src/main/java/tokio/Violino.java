package tokio;

public class Violino extends Cordas{
    @Override
    String tocar(String nota) {
        return vibrar(nota);
    }

    private String vibrar(String nota) {
        return("vibrar... Violino (nota " + nota + ")");
    }
}
