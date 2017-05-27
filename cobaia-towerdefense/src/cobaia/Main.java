package cobaia;

public class Main {

    public static void main(String[] args) {
        
        Jogo jogo = new Jogo(100, 100);
        
        Ataque ataqueDuploNoFim = new AtaqueDuploNoFim();
        Ataque ataqueMaisVida = new AtaqueMaisVida();
        Ataque ataqueFulminante = new AtaqueFulminante();
        
        Torre torre = new Torre(10, 10, 5, 10);
        torre.setAtaque(ataqueDuploNoFim);
        
        // x, y, dano, alcance
        jogo.adicionaTorre(torre);        
        
        // x, y, dano, vida
        // dois inimigos ao alcance        
        jogo.adicionaInimigo(5, 5, 5, 50);
        //jogo.adicionaInimigo(6, 6, 5, 50);
        //jogo.adicionaInimigo(7, 7, 5, 50);
        //jogo.adicionaInimigo(8, 8, 5, 50);
        
        while (jogo.loop()) {   
            //torre.setAtaque(ataqueMaisVida);
            jogo.printInimigos();
            System.out.println("---------------");
        }
        jogo.printInimigos();
       
    }
    
}
