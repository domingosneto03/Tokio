package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Carros!");

        Carro.Chassis chassis = new Carro.Chassis("Aço", 1575);

        Carro.Roda rodaFrente1 = new Carro.Roda(20, Tipo.SECO, "Pirelli", "P Zero");
        Carro.Roda rodaFrente2 = new Carro.Roda(20, Tipo.SECO, "Pirelli", "P Zero");
        Carro.Roda rodaTras1 = new Carro.Roda(21, Tipo.SECO, "Pirelli", "P Zero");
        Carro.Roda rodaTras2 = new Carro.Roda(21, Tipo.SECO, "Pirelli", "P Zero");
        Carro.Roda[] rodas = {rodaFrente1, rodaFrente2, rodaTras1, rodaTras2};

        Carro lambo = new Carro.Builder("Lamborghini", "Aventador S", "DO69MI", 740, 350)
                .chassis(chassis)
                .roda(rodas)
                .build();

        lambo.info();


    }
}