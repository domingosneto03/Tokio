package tokio;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }
    public void miar() {
        System.out.println("O gato está a miar");
    }
}