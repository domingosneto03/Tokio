package org.example;

public class Subcontratados extends Trabalhadores {
    private String especialidade;
    public Subcontratados(String nome, String apelido, String id, String morada, String telefone, String nrSegSocial, String turno, String especialidade) {
        super(nome, apelido, id, morada, telefone, nrSegSocial, 400, turno);
        this.especialidade = especialidade;
    }

    @Override
    int salarioTurno() {
        if(getTurno().equals("noite")) setSalario(getSalario() + 150);
        if(especialidade.equals("talho")) setSalario(getSalario() + 20);
        return getSalario();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
