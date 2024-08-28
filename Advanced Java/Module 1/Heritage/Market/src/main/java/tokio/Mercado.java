package tokio;

public class Mercado {
    public static void funcionariosMercado(Trabalhadores[] listaFuncionarios) {
        for(Trabalhadores x : listaFuncionarios) {
            System.out.println(
                    "Nome: " + x.getNome() + "\n" +
                    "Apelido: " + x.getApelido() + "\n" +
                    "Número de Identificação: " + x.getId() + "\n" +
                    "Morada: " + x.getMorada() + "\n" +
                    "Telefone: " + x.getTelefone() + "\n" +
                    "Número da Segurança Social: " + x.getNrSegSocial() + "\n" +
                    "Turno: " + x.getTurno() + "\n" +
                    "Salário: " + x.salarioTurno() + ".00€"
            );
            System.out.println("-------------------");
        }
    }
}
