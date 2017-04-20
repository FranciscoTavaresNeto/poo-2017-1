package comheranca;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Com Herança!");
        // Abstrato a = new Concreto();
        // Generico g = new Especifico();
        // Felino f = new Gato();
        // Object o = 34;
        // o = "sdfsdf";
        // o = new Personagem();
        // o = new Gato();
        
        Personagem p1 = new Mago("Flavio");
        Personagem p2 = new Arqueiro("Israel");
        Personagem p3 = new Guerreiro("Gustavo");
        Personagem p4 = new Ladino("Domingos");
        
        System.out.println(p1);
        System.out.println(p1.getVida());
        
        System.out.println(p3);
        p1.ataque(p3);   
        System.out.println(p3);        
        // p1.cura(p3);
        ((Mago)p1).cura(p3);
        System.out.println(p3);
        
        System.out.println(p1.estaVivo());
        
        System.out.println(p1);
        p1.ataque(p1);
        System.out.println(p1);
        
        Jogo jogo = new Jogo();
        jogo.adicionaPersonagem(p1);
        jogo.adicionaPersonagem(p2);
        jogo.adicionaPersonagem(p3);
        jogo.adicionaPersonagem(p4);
        jogo.inicia();
        Personagem vencedor = jogo.getVencedor();
        System.out.println("JOGO!!!-------------");
        System.out.println(vencedor);
        
        
    }
    
}
