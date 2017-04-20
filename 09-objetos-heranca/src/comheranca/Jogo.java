package comheranca;

class Jogo {

    Personagem[] personagens = new Personagem[100];
    int nro = 0;
    Personagem vencedor = null;
    
    void adicionaPersonagem(Personagem p) {
        personagens[nro++] = p;
    }

    void inicia() {
        while (! haUmVivo()) {
            Personagem um = jogadorAleatorio();
            Personagem outro = jogadorAleatorio();
            System.out.println(um.getNome() + " atacando " + outro.getNome());
            um.ataque(outro);
        }
        vencedor = personagemVivo();
    }
        
    private Personagem personagemVivo() {        
        for (int i = 0; i < nro; i++) 
            if (personagens[i].estaVivo()) 
                return personagens[i];
        
        return null;
    }

    private Personagem jogadorAleatorio() {
        return personagens[(int)(Math.random() * nro)];
    }
    
    private boolean haUmVivo() {
        int vivos = 0;
        
        for (int i = 0; i < nro; i++)
            if (personagens[i].estaVivo()) vivos++;
        
        return vivos == 1;
    }

    Personagem getVencedor() {
        return vencedor;
    }

    

    
    
}
