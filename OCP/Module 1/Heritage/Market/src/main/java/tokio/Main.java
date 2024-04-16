package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mercado!");
        System.out.println();
        Trabalhadores[] listaFuncionarios = new Trabalhadores[10];
        listaFuncionarios[0] = new Funcionarios("João", "Silva", "12345", "Rua A", "123456789", "123456789",  "manhã");
        listaFuncionarios[1] = new Repositores("Maria", "Sousa", "23456", "Rua B", "987654321", "987654321", "tarde");
        listaFuncionarios[2] = new Funcionarios("Carlos", "Ferreira", "34567", "Rua C", "987123456", "987123456", "noite");
        listaFuncionarios[3] = new Subcontratados("Ana", "Martins", "45678", "Rua D", "654321987", "654321987", "manhã", "talho");
        listaFuncionarios[4] = new Repositores("António", "Ribeiro", "56789", "Rua E", "789456123", "789456123", "tarde");
        listaFuncionarios[5] = new Subcontratados("Marta", "Lopes", "67890", "Rua F", "456789123", "456789123", "noite", "caixa");
        listaFuncionarios[6] = new Funcionarios("Pedro", "Alves", "78901", "Rua G", "321654987", "321654987", "manhã");
        listaFuncionarios[7] = new Repositores("Sofia", "Pereira", "89012", "Rua H", "987321654", "987321654", "tarde");
        listaFuncionarios[8] = new Subcontratados("Rui", "Oliveira", "90123", "Rua I", "654987321", "654987321", "noite", "talho");
        listaFuncionarios[9] = new Funcionarios("Inês", "Costa", "01234", "Rua J", "321987654", "321987654", "manhã");

        Mercado.funcionariosMercado(listaFuncionarios);
    }
}