package tokio;

abstract class Sopro  extends Instrumentos{
    @Override
    abstract String tocar(String nota);

    public static class Tuba extends Sopro{
        @Override
        String tocar(String nota) {
            return soprar(nota);
        }

        private String soprar(String nota) {
            return("soprar... Tuba (nota " + nota + ")");
        }
    }

    public static class Saxofone extends Sopro{
        @Override
        String tocar(String nota) {
            return soprar(nota);
        }

        private String soprar(String nota) {
            return("soprar... Saxafone (nota " + nota + ")");
        }
    }
}
