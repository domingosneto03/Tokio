package org.example;

public class Informatico extends Pessoal{
    private int horasExtra;
    public Informatico(String nome, String cc, int horasExtra) {
        super(nome, cc, 40, 6); // Informático: 40 horas/semana e um valor de 6 euros/hora.
        this.horasExtra = horasExtra;
    }

    @Override
    public double salario() {
        return (horasSemana * valorHora * 4 + horasExtra*6) * 100; // salario em cêntimos
    }

    @Override
    public String getCategoria() {
        return "Informático";
    }
}
