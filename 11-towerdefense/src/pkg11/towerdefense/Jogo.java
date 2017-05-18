package pkg11.towerdefense;

public class Jogo {

    private final Grid grid;    
    private final IList<Torre> torres = new List();    
    private final IList<Inimigo> inimigos = new List();
    
    public Jogo(int largura, int altura) {
        this.grid = new Grid(largura, altura);
    }

    public void adicionaTorre(int x, int y, int dano, int alcance) {
       if (x >= grid.largura) throw new IllegalArgumentException();
       if (y >= grid.altura) throw new IllegalArgumentException();
       
       torres.append(new Torre(x, y, dano, alcance));
    }

    public void adicionaInimigo(int x, int y, int dano, int vida) {
       if (x >= grid.largura) throw new IllegalArgumentException();
       if (y >= grid.altura) throw new IllegalArgumentException();
       
       inimigos.append(new Inimigo(x, y, dano, vida));
    }

    public void printTorres() {
        for (int i = 0; i < torres.count(); i++) {
            System.out.println(torres.get(i));
        } 
    }

    public void printInimigos() {
        for (int i = 0; i < inimigos.count(); i++) {
            System.out.println(inimigos.get(i));
        }
    }
    
    public boolean loop() {        
        for (int t = 0; t < torres.count(); t++) {
            Torre torre = torres.get(t);            
            IList<Inimigo> alvos = new List();            
            for (int i = 0; i < inimigos.count(); i++) {
                Inimigo inimigo = inimigos.get(i);
                if (inimigo.taVivo() && torre.alcanca(inimigo)) {
                    alvos.append(inimigo);
                }
            }            
            if (! alvos.empty()) torre.ataca(alvos);            
        }        
        
        return countInimigosVivos() > 0;
    }
    
    private int countInimigosVivos() {
        int inimigosVivos = 0;
        for (int i = 0; i < inimigos.count(); i++)
            if (inimigos.get(i).taVivo()) inimigosVivos++;
        return inimigosVivos;
    }
    
    
    
    private class Grid {

        private final int largura;
        private final int altura;
        
        private Grid(int largura, int altura) {
            this.largura = largura;
            this.altura = altura;
        }
        
    }
    
}
