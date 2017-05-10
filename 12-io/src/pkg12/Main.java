package pkg12;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws Exception {

        Arquivo a = new Arquivo(); // comentario
        
        a.salva("/home/torres/a.txt", "lero lorem ipsun");
        
        String texto = a.abre("/home/torres/Temp/teste.js");
        
        System.out.println(texto);

    }
    
}

