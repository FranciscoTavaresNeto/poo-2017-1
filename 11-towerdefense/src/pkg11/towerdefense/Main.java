package pkg11.towerdefense;

public class Main {

    public static void main(String[] args) {

        Jogo jogo = new Jogo(100, 100);
        
        // x, y, dano, alcance
        jogo.adicionaTorre(10, 10, 5, 5);
        jogo.adicionaTorre(90, 90, 10, 5);
        
        // x, y, dano, vida
        jogo.adicionaInimigo(8, 8, 5, 50);
        jogo.adicionaInimigo(5, 5, 5, 50);
        
        jogo.printTorres();
        jogo.printInimigos();
        
        jogo.loop(); // tick
        jogo.loop();
        
        jogo.printTorres();
        jogo.printInimigos();
        
       
    }
    
}
