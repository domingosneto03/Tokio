package tokio;

abstract class Cordas extends Instrumentos{
    @Override
    abstract String tocar(String nota);

    public static class Violino extends Cordas{
        @Override
        String tocar(String nota) {
            return vibrar(nota);
        }

        private String vibrar(String nota) {
            return("vibrar... Violino (nota " + nota + ")");
        }
    }

    public static class Contrabaixo extends Cordas{
        @Override
        String tocar(String nota) {
            return vibrar(nota);
        }

        private String vibrar(String nota) {
            return("vibrar... Violino (nota " + nota + ")");
        }
    }
}
