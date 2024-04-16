package tokio;

public class Funcionarios extends Trabalhadores{
    public Funcionarios(String nome, String apelido, String id, String morada, String telefone, String nrSegSocial, String turno) {
        super(nome, apelido, id, morada, telefone, nrSegSocial, 450, turno);
    }

    @Override
    int salarioTurno() {
        if(getTurno().equals("noite")) setSalario(getSalario() + 150);
        return getSalario();
    }
}
