package pkg11.towerdefense;

public class Main {

    public static void main(String[] args) {

        Jogo jogo = new Jogo(100, 100);
        
        // x, y, dano, alcance
        jogo.adicionaTorre(10, 10, 5, 10);        
        
        // x, y, dano, vida
        // dois inimigos ao alcance        
        jogo.adicionaInimigo(8, 8, 5, 50);
        jogo.adicionaInimigo(5, 5, 5, 50);
        
        while (jogo.loop()) {            
            jogo.printInimigos();
            System.out.println("---------------");
        }
        jogo.printInimigos();
       
    }
    
}
