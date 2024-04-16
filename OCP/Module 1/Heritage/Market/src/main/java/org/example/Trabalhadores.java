package org.example;

abstract class Trabalhadores extends Pessoas{
    private String nrSegSocial;
    private int salario;
    private String turno;
    public Trabalhadores(String nome, String apelido, String id, String morada, String telefone, String nrSegSocial, int salario, String turno) {
        super(nome, apelido, id, morada, telefone);
        this.nrSegSocial = nrSegSocial;
        this.salario = salario;
        this.turno = turno;
    }

    abstract int salarioTurno();

    public String getNrSegSocial() {
        return nrSegSocial;
    }

    public void setNrSegSocial(String nrSegSocial) {
        this.nrSegSocial = nrSegSocial;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
