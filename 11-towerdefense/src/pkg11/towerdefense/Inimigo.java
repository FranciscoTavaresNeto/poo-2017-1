package pkg11.towerdefense;

public class Inimigo {

    private final int x;
    private final int y;
    private final int dano;
    private int vida;

    public Inimigo(int x, int y, int dano, int vida) {
        this.x = x;
        this.y = y;
        this.dano = dano;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Inimigo{" + "x=" + x + ", y=" + y + ", dano=" + dano + ", vida=" + vida + '}';
    }

    public void sofreDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
    }

    public int getVida() {
        return this.vida;
    }

    public boolean taVivo() {
        return this.vida > 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    
    
}
