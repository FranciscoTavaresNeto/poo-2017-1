package cobaia;

public abstract class Peca {
    
    public final int x, y;
    public int dano;
    
    public Peca(int x, int y, int dano) {
        this.x = x;
        this.y = y;
        this.dano = dano;
    }
    
    
    public double distancia(Peca p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));        
    }
}
