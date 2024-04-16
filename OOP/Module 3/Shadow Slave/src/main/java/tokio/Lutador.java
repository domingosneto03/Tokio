package tokio;

public interface Lutador {
    int atacar(int hpAdversario);
    void defender();
    void obterVida();
    int getHp();
    int getAttackPoints();
    String getName();
    void setHp(int hp);

}
