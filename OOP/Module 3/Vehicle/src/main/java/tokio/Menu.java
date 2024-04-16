package tokio;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Veiculo> veiculos = new ArrayList<>();
    public void mainMenu() {
        System.out.println("Escolha uma opção:" +
                "\n\t (1) Carro" +
                "\n\t (2) Mota" +
                "\n\t (3) Seus Veículos" +
                "\n\t (4) Sair");
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> carroMenu();
            case 2 -> motaMenu();
            case 3 -> listaVeiculos();
            case 4 -> System.exit(0);
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                mainMenu();
            }
        }
    }

    private void carroMenu() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é a marca do carro?");
        String marcaChoice = in.nextLine();

        System.out.println("De que ano ele é?");
        int anoChoice = Integer.parseInt(in.nextLine());

        System.out.println("Quantas portas tem?");
        int portasChoice = Integer.parseInt(in.nextLine());

        Carro carro = new Carro(marcaChoice, anoChoice, portasChoice);
        veiculos.add(carro);

        System.out.println("Adicionou este carro à sua garagem");
        carro.apresentar();
        mainMenu();

    }
    private void motaMenu() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é a marca da mota?");
        String marcaChoice = in.nextLine();

        System.out.println("De que ano ela é?");
        int anoChoice = Integer.parseInt(in.nextLine());

        System.out.println("Qual é o tipo da mota?");
        String tipoChoice = in.nextLine();

        Mota mota = new Mota(marcaChoice, anoChoice, tipoChoice);
        veiculos.add(mota);

        System.out.println("Adicionou esta mota à sua garagem");
        mota.apresentar();
        mainMenu();
    }
    private void listaVeiculos() {
        if(veiculos.isEmpty()) {
            System.out.println("Ainda não tens veículos na tua garagem");
            mainMenu();
        }
        int i = 1;
        for(Veiculo x : veiculos) {
            System.out.println("(" + i + ") " + x.marca + "(" + x.ano + ")");
            i++;
        }
        System.out.println("Escolha um dos seus veículos ('0' se pretender voltar para o menu principal");
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        // Dependendo das opções que aparece na lista, apresentar o veículo
        if(choice==0)
            mainMenu();
        else {
            Veiculo veiculo = veiculos.get(choice-1);
            veiculo.apresentar();
            mainMenu();
        }
    }
}
