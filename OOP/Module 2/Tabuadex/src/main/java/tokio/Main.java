package tokio;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Tabuadex");
        Scanner in = new Scanner(System.in);
        System.out.println("Vais responder a 10 perguntas de tabuada aleatórias e verificar quantos pontos consegues ganhar! \n" +
                "Por cada pergunta certa ganhas 10 pontos! Por cada resposta errada perdes 5!");
        System.out.println("Estás pronto? (s/n)");
        String ready = in.nextLine();
        if(ready.equals("s")) tabuadex();
        else System.exit(0);
    }

    private static void tabuadex() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int upperbound = 100; //limite máximo de número aleatório (99);
        int[] list = new int[] {2,6,41,7,84,5,46,8,92,3}; //lista de números a multiplicar
        int count = 0; //contador de pontos
        for(int x:list) {
            int rand = random.nextInt(upperbound);
            int res = x*rand;
            System.out.println("Quanto é " + x+"x"+rand+"?");
            int answer = in.nextInt();
            if(answer==res) {
                count += 10;
                System.out.println("Está certo! Fantástico! Tens " + count + " pontos!");
            } else {
                count -= 5;
                System.out.println("Que pena! Não está certo! Tens " + count + " pontos!");
            }
        }
        System.out.println("Acabou o jogo! Acabaste com " + count + " pontos!"); //Mensagem após acabar o jogo
        //Diferentes mensagens dependendo da pontuação final
        if(count<50)
            System.out.println("Podia ter corrido melhor, mas não desanimes!");
        else if(count>=50 && count<80)
            System.out.println("Estiveste bem! Não pares de tentar porque estás cada vez mais perto da pontuação máxima!");
        else if(count>=80 && count<100)
            System.out.println("Que ótimo desempenho. És incrível no que toca a tabuadex");
        else System.out.println("Excelente! Atingiste a pontuação máxima. Ficas para o ranking de competidores que jogarão tabuadex com temporizador!");
    }
}