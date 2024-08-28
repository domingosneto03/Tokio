package tokio;

public class Repositores extends Trabalhadores{
    public Repositores(String nome, String apelido, String id, String morada, String telefone, String nrSegSocial, String turno) {
        super(nome, apelido, id, morada, telefone, nrSegSocial, 530, turno);
    }

    @Override
    int salarioTurno() {
        if(getTurno().equals("noite")) setSalario(getSalario() + 150);
        return getSalario();
    }
}
