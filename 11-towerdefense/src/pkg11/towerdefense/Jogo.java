package pkg11.towerdefense;

public class Jogo {

    private final Grid grid;
    
    private final Torre[] torres = new Torre[100];
    private int torresCont = 0;
    
    private Inimigo[] inimigos = new Inimigo[100];
    private int inimigosCont = 0;

    public Jogo(int largura, int altura) {
        this.grid = new Grid(largura, altura);
    }

    public void adicionaTorre(int x, int y, int dano, int alcance) {
       if (x >= grid.largura) throw new IllegalArgumentException();
       if (y >= grid.altura) throw new IllegalArgumentException();
       
       torres[torresCont++] = new Torre(x, y, dano, alcance);
    }

    public void adicionaInimigo(int x, int y, int dano, int vida) {
       if (x >= grid.largura) throw new IllegalArgumentException();
       if (y >= grid.altura) throw new IllegalArgumentException();
       
       inimigos[inimigosCont++] = new Inimigo(x, y, dano, vida);
    }

    public void printTorres() {
        for (int i = 0; i < torresCont; i++) {
            System.out.println(torres[i]);
        } 
    }

    public void printInimigos() {
        for (int i = 0; i < inimigosCont; i++) {
            System.out.println(inimigos[i]);
        }
    }
    
    public void loop() {        
        for (int t = 0; t < torresCont; t++) {
            Torre torre = torres[t];
            for (int i = 0; i < inimigosCont; i++) {
                Inimigo inimigo = inimigos[i];
                if (inimigo.taVivo()) {
                    torre.ataca(inimigo);
                }
            }
        }        
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
