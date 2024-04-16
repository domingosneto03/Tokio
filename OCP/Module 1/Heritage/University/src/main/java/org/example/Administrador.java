package org.example;

public class Administrador extends Pessoal{
    private int horasExtra;

    public Administrador(String nome, String cc, int horasExtra) {
        super(nome, cc, 37, 7.5); // Administrativo: 37 horas/semana e um valor de 7,5 euros/hora.
        this.horasExtra = horasExtra;
    }

    @Override
    public double salario() {
        return (horasSemana * valorHora * 4 + horasExtra*6) * 100; // salario em cêntimos
    }

    @Override
    public String getCategoria() {
        return "Administrador";
    }
}
