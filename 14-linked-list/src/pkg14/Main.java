package pkg14;

public class Main {

    public static void main(String[] args) {

        IList lista = new ListLinkada();

        System.out.println(lista.count() == 0);
        System.out.println(lista.empty() == true);
        System.out.println(lista.get(0) == null);
        System.out.println(lista.getFirst() == null);
        System.out.println(lista.getLast() == null);

        lista.append("a");

        System.out.println(lista.empty() == false);
        System.out.println(lista.count() == 1);
        System.out.println(lista.get(0).equals("a"));
        System.out.println(lista.getFirst().equals("a"));
        System.out.println(lista.getLast().equals("a"));
        System.out.println(lista.getFirst().equals(lista.getLast()));

        
        
        lista.append(2);
        lista.append("c");
        lista.append("d");
        lista.append("e");

        System.out.println(lista.count() == 5);
        
        System.out.println(lista.indexOf("a") == 0);
        System.out.println(lista.indexOf(2) == 1);
        System.out.println(lista.indexOf("e") == 4);
        System.out.println(lista.indexOf("f") == -1);
        System.out.println(lista.indexOf(3) == -1);

        
        
        System.out.println(lista.getFirst().equals("a"));
        System.out.println(lista.getLast().equals("e"));

        System.out.println(lista.get(1).equals(2));
        System.out.println(lista.get(2).equals("c"));
        System.out.println(lista.get(5) == null);

        System.out.println(lista.has("a") == true);
        System.out.println(lista.has(3) == false);
        System.out.println(lista.has("f") == false);
        System.out.println(lista.has(2) == true);

        
        
        System.out.println(lista.count() == 5);
        lista.append(null);
        System.out.println(lista.count() == 5);

        System.out.println(lista.delete(1) == true);
        System.out.println(lista.delete(9) == false);

        System.out.println(lista.count() == 4);

        
        System.out.println(lista.get(0).equals("a"));
        System.out.println(lista.get(1).equals("c"));
        System.out.println(lista.get(2).equals("d"));
        System.out.println(lista.get(3).equals("e"));

        System.out.println(lista.drop(2).equals("d"));

        
        System.out.println(lista.count() == 3);

        System.out.println(lista.remove("c") == true);

        System.out.println(lista.count() == 2);

        
        System.out.println(lista.get(0).equals("a"));
        System.out.println(lista.get(1).equals("e"));

        System.out.println(lista.drop(2) == null);
        System.out.println(lista.remove("c") == false);

        
        lista.clean();

        System.out.println(lista.count() == 0);
        System.out.println(lista.empty() == true);
        System.out.println(lista.get(0) == null);
        System.out.println(lista.getFirst() == null);
        System.out.println(lista.getLast() == null);

        
        lista.append("Chell");
        lista.append("Alucard");

        System.out.println(lista.count() == 2);
        System.out.println(lista.empty() == false);
        System.out.println(lista.get(0).equals("Chell"));
        System.out.println(lista.get(1).equals("Alucard"));

        
        lista.prepend("Sagat");

        System.out.println(lista.count() == 3);
        System.out.println(lista.get(0).equals("Sagat"));
        System.out.println(lista.get(1).equals("Chell"));
        System.out.println(lista.get(2).equals("Alucard"));

        /*
        System.out.println(lista.insert("Claire Redfield", 1) == true);

        System.out.println(lista.count() == 4);
        System.out.println(lista.get(0).equals("Sagat"));
        System.out.println(lista.get(1).equals("Claire Redfield"));
        System.out.println(lista.get(2).equals("Chell"));
        System.out.println(lista.get(3).equals("Alucard"));

        System.out.println(lista.insert("Zelda", -1) == false);
        System.out.println(lista.insert("Zelda", 5) == false);

        System.out.println(lista.count() == 4);

        // inserir no fim pode!
        System.out.println(lista.insert("Zelda", 4) == true);

        System.out.println(lista.count() == 5);
        System.out.println(lista.get(0).equals("Sagat"));
        System.out.println(lista.get(1).equals("Claire Redfield"));
        System.out.println(lista.get(2).equals("Chell"));
        System.out.println(lista.get(3).equals("Alucard"));
        System.out.println(lista.get(4).equals("Zelda"));
        */
    }
}
