package tokio;

import java.util.List;

public class Orquestra extends Instrumentos{
    private final String[] instrumentos = {"Timbale", "Xilofone", "Violino", "Contrabaixo", "Tuba", "Saxafone"};
    @Override
    String tocar(String nota) {
        StringBuilder res = new StringBuilder();
        for(String x : instrumentos)
            res.append(pickInstrument(x, nota)).append("\n");
        return String.valueOf(res);
    }

    private String pickInstrument(String instrumento, String nota) {
        switch (instrumento) {
            case "Timbale" -> {
                Timbale x = new Timbale();
                return x.tocar(nota);
            }
            case "Xilofone" -> {
                Xilofone x = new Xilofone();
                return x.tocar(nota);
            }
            case "Violino" -> {
                Violino x = new Violino();
                return x.tocar(nota);
            }
            case "Contrabaixo" -> {
                Contrabaixo x = new Contrabaixo();
                return x.tocar(nota);
            }
            case "Tuba" -> {
                Tuba x = new Tuba();
                return x.tocar(nota);
            }
            default -> {
                Saxofone x = new Saxofone();
                return x.tocar(nota);
            }
        }
    }
}
