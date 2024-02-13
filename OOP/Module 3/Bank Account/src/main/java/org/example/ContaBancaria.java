package org.example;

import java.util.Scanner;

public class ContaBancaria {
    private long numeroConta;
    private String titular;
    private double saldo;

    public void levantar(double quantia) {
        saldo -= quantia;
        System.out.println("Quantia levantada com sucesso! Saldo atual: " + saldo + "€");
    }
    public void depositar(double quantia) {
        saldo += quantia;
        System.out.println("Quantia depositada com sucesso! Saldo atual: " + saldo + "€");
    }
    public void verificarSaldo() {
        System.out.println("O seu saldo é: " + saldo + "€");
    }

    public ContaBancaria(long numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
