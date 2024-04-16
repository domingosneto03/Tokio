package tokio;

abstract class Pessoal {
    protected String nome;
    protected String cc;
    protected int horasSemana;
    protected double valorHora;

    public Pessoal(String nome, String cc, int horasSemana, double valorHora) {
        this.nome = nome;
        this.cc = cc;
        this.horasSemana = horasSemana;
        this.valorHora = valorHora;
    }

    abstract public double salario();
    abstract public String getCategoria();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
