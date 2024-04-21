package tokio;

public class Animais {
    private String nome;
    private String descricao;
    private String raca;
    private double peso;
    private double altura;

    private boolean perigoso;
    private Comida comida;
    private int quantidadeComida = 0;

    public Animais(String nome, String descricao, String raca, double peso, double altura, Comida comida) {
        this.nome = nome;
        this.descricao = descricao;
        this.raca = raca;
        this.peso = peso;
        this.altura = altura;
        this.comida = comida;
    }

    public void marcarComoPerigoso() {
        this.perigoso = true;
    }

    public void alimentar(int quantidade) {
        quantidadeComida += quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public Comida getComida() {
        return comida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome: " + nome + '\'' +
                ", descrição " + descricao + '\'' +
                ", peso " + peso +
                ", quantidade " + quantidadeComida +
                '}';
    }
}
