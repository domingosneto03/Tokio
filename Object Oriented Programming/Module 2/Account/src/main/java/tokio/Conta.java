package tokio;

public class Conta {
    private String titular;
    private long numeroConta;
    private double quantidade;

    public Conta(String titular, long numeroConta, double quantidade) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.quantidade = quantidade;
    }

    public String getTitular() {
        return titular;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
