package tokio;

public class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void apresentar() {
        System.out.println(" Marca: " + marca +
                "\n Ano: " + ano +
                "\n Estado: Novo" +
                "\n Transmissão: Manual");
    }
}

class Carro extends Veiculo {
    public int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }
}

class Mota extends Veiculo {
    public String tipo;

    public Mota(String marca, int ano, String tipo) {
        super(marca, ano);
        this.tipo = tipo;
    }
}
