package pkg11.towerdefense;

public class Torre {

    private final int x;
    private final int y;
    private final int dano;
    private final int alcance;

    public Torre(int x, int y, int dano, int alcance) {
        this.x = x;
        this.y = y;
        this.dano = dano;
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return "Torre{" + "x=" + x + ", y=" + y + ", dano=" + dano + ", alcance=" + alcance + '}';
    }

    public void ataca(Inimigo inimigo) {
        if (alcanca(inimigo)) {
            inimigo.sofreDano(this.dano);
        }
    }

    public boolean alcanca(Inimigo inimigo) {
        int dx = inimigo.getX() - this.x;
        int dy = inimigo.getY() - this.y;
        double distancia = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));        
        return distancia <= this.alcance;
    }
   
}



