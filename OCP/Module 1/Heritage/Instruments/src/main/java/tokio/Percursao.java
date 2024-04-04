package tokio;

abstract class Percursao extends Instrumentos{
    @Override
    abstract String tocar(String nota);

    public static class Timbale extends Percursao{

        @Override
        String tocar(String nota) {
            return("tocar... Timbale (nota " + nota + ")");
        }
    }

    public static class Xilofone extends Percursao{
        @Override
        String tocar(String nota) {
            return("tocar... Xilofone (nota " + nota + ")");
        }
    }
}
