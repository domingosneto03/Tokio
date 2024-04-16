package tokio;

public class Universidade {
    public static void imprimirNominas(Pessoal[] listaPessoal) {
        for(Pessoal x : listaPessoal) {
            System.out.println(
                    "Nome: " + x.nome + "\n" +
                    "Categoria: " + x.getCategoria() + "\n" +
                    "Salário Mensal: " + x.salario()/100 + "€ por mês");
            System.out.println();
        }
    }

    public static double obterOrcamentiTotal(Pessoal[] listaPessoal) {
        double total = 0.0;
        for(Pessoal x : listaPessoal) {
            total += x.salario();
        }
        total /= 100;
        System.out.println("A Universidade gasta " + total + "€ em pessoal");
        return total;
    }

}
