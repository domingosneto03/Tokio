package org.example;

public class Investigador extends Pessoal{
    public Investigador(String nome, String cc) {
        super(nome, cc, 35, 7); // Investigadores: 35 horas/semana com um valor de 7 euros/hora
    }

    @Override
    public double salario() {
        return horasSemana * valorHora * 4 * 100; // salário em cêntimos
    }

    @Override
    public String getCategoria() {
        return "Investigador";
    }
}
