package tokio;

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
                Percursao.Timbale x = new Percursao.Timbale();
                return x.tocar(nota);
            }
            case "Xilofone" -> {
                Percursao.Xilofone x = new Percursao.Xilofone();
                return x.tocar(nota);
            }
            case "Violino" -> {
                Cordas.Violino x = new Cordas.Violino();
                return x.tocar(nota);
            }
            case "Contrabaixo" -> {
                Cordas.Contrabaixo x = new Cordas.Contrabaixo();
                return x.tocar(nota);
            }
            case "Tuba" -> {
                Sopro.Tuba x = new Sopro.Tuba();
                return x.tocar(nota);
            }
            default -> {
                Sopro.Saxofone x = new Sopro.Saxofone();
                return x.tocar(nota);
            }
        }
    }
}
