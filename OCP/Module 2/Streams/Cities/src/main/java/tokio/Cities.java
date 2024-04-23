package tokio;

import java.util.Objects;

public class Cities {
    private String nome;
    private String distrito;
    private int habitantes;

    public Cities(String nome, String distrito, int habitantes) {
        this.nome = nome;
        this.distrito = distrito;
        this.habitantes = habitantes;
    }

    public String getNome() {
        return nome;
    }

    public String getDistrito() {
        return distrito;
    }

    public int getHabitantes() {
        return habitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return habitantes == cities.habitantes && nome.equals(cities.nome) && distrito.equals(cities.distrito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, distrito, habitantes);
    }

    @Override
    public String toString() {
        return String.format("[nome: %s, distrito: %s, habitantes: %d]", nome, distrito, habitantes);
    }
}
