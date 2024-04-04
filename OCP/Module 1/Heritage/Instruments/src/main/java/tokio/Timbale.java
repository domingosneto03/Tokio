package tokio;

public class Timbale extends Percursao{

    @Override
    String tocar(String nota) {
        return("tocar... Timbale (nota " + nota + ")");
    }
}
