package pkg15;

import java.util.ArrayList;

public class Main {
    // MANTRA:
    // preferir depender de uma abstração
    // em vez de uma implementação
    public static void main(String[] args) {

        Produto p1 = new Produto("TV 40\"", 2000.0);
        Produto p2 = new Produto("Smartphone LG", 1000.0);
        
        IList lista = new List();
        lista.append(p1);
        lista.append(p2);
        // lista.append("ssadas");
        // ArrayList lista = new ArrayList();
        // lista.add(p1);
        // lista.add(p2);
        
        // IList lista2 = new ArrayListToIList(lista);
        
        Pedido ped = new Pedido(lista);
        
        System.out.println(ped);
    }
    
}
