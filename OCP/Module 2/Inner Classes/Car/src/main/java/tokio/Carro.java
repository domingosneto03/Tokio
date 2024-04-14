package tokio;

public class Carro {
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int velocidadeMaxima;
    private Chassis chassis;
    private Roda[] rodas;

    private Carro(Builder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.matricula = builder.matricula;
        this.potencia = builder.potencia;
        this.velocidadeMaxima = builder.velocidadeMaxima;
        this.chassis = builder.chassis;
        this.rodas = builder.rodas;
    }

    public void info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matíricula: " + matricula);
        System.out.println("Potência: " + potencia + "CV");
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + "km/h");
        System.out.println("Chassis: ");
        chassis.info();
        System.out.println("Rodas: ");
        for(Roda roda : rodas) roda.info();

    }

    public static class Chassis {
        private String material;
        private int peso;

        public Chassis(String material, int peso) {
            this.material = material;
            this.peso = peso;
        }

        public void info() {
            System.out.println("\t Material: " + material);
            System.out.println("\t Peso " + peso + "Kg");
        }
    }

    public static class Roda {
        private int medida;
        private Tipo tipo;
        private String marca;
        private String modelo;

        public Roda(int medida, Tipo tipo, String marca, String modelo) {
            this.medida = medida;
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }

        public void info() {
            System.out.println("\t Marca: " + marca);
            System.out.println("\t Modelo: "+ modelo);
            System.out.println("\t Tipo: " + tipo);
            System.out.println("\t Medida: " + medida);
        }
    }

    static class Builder {
        private String matricula;
        private String marca;
        private String modelo;
        private int potencia;
        private int velocidadeMaxima;
        private Chassis chassis;
        private Roda[] rodas;

        public Builder(String marca, String modelo, String matricula, int potencia, int velocidadeMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.matricula = matricula;
            this.potencia = potencia;
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public Builder chassis(Chassis chassis) {
            this.chassis = chassis;
            return this;
        }

        public Builder roda(Roda[] rodas) {
            this.rodas = rodas;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }
}
