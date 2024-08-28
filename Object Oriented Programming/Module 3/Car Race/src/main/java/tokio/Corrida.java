package tokio;

import java.util.Scanner;

public class Corrida {
    static Scanner in = new Scanner(System.in);

    Carro carro1 = new Carro("Ferrari", 290);
    Carro carro2 = new Carro("Lamborghini", 340);
    Carro carro3 = new Carro("Bugatti", 400);

    int x = carro1.correr();
    int y = carro2.correr();
    int z = carro3.correr();
    public void menu() {
        System.out.println("Escolha o seu carro para a corrida" +
                "\n\t (1) Ferrari" +
                "\n\t (2) Lamborghini" +
                "\n\t (3) Bugatti" +
                "\n\t (4) Desistir");

        int choice = Integer.parseInt(in.nextLine());
        if(choice == 4)
            System.exit(0); //termina o programa
        else if (choice >= 1 && choice <= 3)
            System.out.println("Vamos começar... !");
        else {
            System.out.println("Opção inválida. Tente novamente.");
            menu();
        }
        System.out.println("O carro vencedor é: " + Carro.vencedor + ". Durações:" +
                "\n\t Ferrari: " + x + " minutos." +
                "\n\t Lamborghini: " + y + " minutos." +
                "\n\t Bugatti: " + z + " minutos.");
    }
}
