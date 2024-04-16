package org.example;

public class Pessoas {
    private String nome;
    private String apelido;
    private String id;
    private String morada;
    private String telefone;

    public Pessoas(String nome, String apelido, String id, String morada, String telefone) {
        this.nome = nome;
        this.apelido = apelido;
        this.id = id;
        this.morada = morada;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
