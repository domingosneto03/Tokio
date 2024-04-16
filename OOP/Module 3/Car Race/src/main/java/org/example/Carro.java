package org.example;

import java.util.Random;


public class Carro {
    Random random = new Random();
    public static String vencedor;
    private static int menorTempo = Integer.MAX_VALUE; // variável estática para rastrear o menor tempo
    public String nome;
    public int velocidade;

    public Carro(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }
    public int correr() {
        int duration;
        if(velocidade >= 250 && velocidade < 300)
            duration = random.nextInt(9-6) + 6; //duração aleatoria entre 6 a 8 minutos
        else if(velocidade >= 300 && velocidade < 350)
            duration = random.nextInt(7-4) + 4; //duração aleatoria entre 4 a 6 minutos
        else
            duration = random.nextInt(5-2) + 2; //duração aleatoria entre 2 a 4 minutos
        // Atualiza o vencedor se este carro tiver o menor tempo
        if (duration < menorTempo) {
            vencedor = this.nome;
            menorTempo = duration;
        }
        return duration;
    }

}
