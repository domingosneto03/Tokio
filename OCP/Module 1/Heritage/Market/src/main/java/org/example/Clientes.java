package org.example;

public class Clientes extends Pessoas{
    private String codCliente;
    private int compras;
    private int desconto;
    public Clientes(String nome, String apelido, String id, String morada, String telefone, String codCliente) {
        super(nome, apelido, id, morada, telefone);
        this.codCliente = codCliente;
        this.compras = 0;
        this.desconto = 0;
    }

    public void compra() {
        compras++;
        if(compras==100) desconto++;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
