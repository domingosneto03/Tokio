package org.example;

public class Sunny implements Lutador{

    private String name;
    private int hp;
    private int attackPoints;

    public Sunny(String name, int hp, int attackPoints) {
        this.name = name;
        this.hp = hp;
        this.attackPoints = attackPoints;
    }

    @Override
    public int atacar(int hpAdversario) {
        hpAdversario -= attackPoints;
        if(hpAdversario<=0) hpAdversario = 0; // Vida mínima
        return hpAdversario;
    }

    @Override
    public void defender() {
        hp += 5; // Dano do adversário tira menos vida
        if(hp>100) hp = 100;
    }

    @Override
    public void obterVida() {
        hp += 30;
        if(hp>100) hp = 100; // máximo de vida
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoints() {
        return attackPoints;
    }
    public String getName() {
        return name;
    }

}

