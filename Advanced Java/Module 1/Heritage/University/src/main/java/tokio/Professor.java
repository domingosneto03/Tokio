package tokio;

public class Professor extends Pessoal{
    private int sexenio;
    public Professor(String nome, String cc, int sexenio) {
        super(nome, cc, 37, 8); // Professores: 37 horas/semana com um valor de 8 euros/hora.
        this.sexenio = sexenio;
    }

    @Override
    public double salario() {
        return (horasSemana * valorHora * 4 + 100 * sexenio) * 100; // salário em cêntimos
    }

    @Override
    public String getCategoria() {
        return "Professor";
    }
}
