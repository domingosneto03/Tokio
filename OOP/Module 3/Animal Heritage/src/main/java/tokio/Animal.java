package tokio;

public class Animal {
    protected String nome;
    public Animal(String nome) {
        this.nome = nome;
    }
    public void emitirSom() {
        System.out.println("O animal emite um som");
    }
}
