package cobaia;

public class Inimigo extends Peca {

    private int vida;

    public Inimigo(int x, int y, int dano, int vida) {
        super(x, y, dano);
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

    public boolean taMorto() {
        return ! taVivo();
    }
    
    
    
}
