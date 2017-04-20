package semheranca;

public class Main {

    public static void main(String[] args) {

        // 0:arqueiro 1:guerreiro e 2:mago
        Personagem p1 = new Personagem("Flavio", 2);
        Personagem p2 = new Personagem("Israel", 0);
        Personagem p3 = new Personagem("Gustavo", 1);
        Personagem p4 = new Personagem("Domingos", 3);
        // 3:Ladino (atk 14)
        
        System.out.println(p3); // 100 vida
        p1.ataque(p3);
        System.out.println(p3); // 95 vida
        
        System.out.println(p1); // 100 vida
        p3.ataque(p1);
        System.out.println(p1); // 88 vida

        System.out.println(p2); // 100 vida
        p4.ataque(p2);
        System.out.println(p2); // 86 vida
    }
    
}
