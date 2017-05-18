package pkg15;

import java.util.ArrayList;

public class Main {
    // MANTRA:
    // preferir depender de uma abstração
    // em vez de uma implementação
    public static void main(String[] args) {

        Produto p1 = new Produto("TV 40\"", 2000.0);
        Produto p2 = new Produto("Smartphone LG", 1000.0);
        Servico s1 = new Servico("Instalação TV", 200.0);
        Servico s2 = new Servico("Garantia Estendida", 100.0);
        
        IList<Venda> lista = new List();
        lista.append(p1);
        lista.append(p2);
        lista.append(s1);
        lista.append(s2);
        // essa linha não compila devido
        // ao parâmetro de tipo <Produto>
        // lista.append("ssadas");
        
        // ArrayList lista2 = new ArrayList();
        // lista2.add(p1);
        // lista2.add(p2);        
        // IList lista = new ArrayListToIList(lista2);        
        Pedido ped = new Pedido(lista);
        
        System.out.println(ped);
    }
    
}
