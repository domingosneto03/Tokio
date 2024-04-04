package tokio;

public class Saxofone extends Sopro{
    @Override
    String tocar(String nota) {
        return soprar(nota);
    }

    private String soprar(String nota) {
        return("soprar... Saxafone (nota " + nota + ")");
    }
}
