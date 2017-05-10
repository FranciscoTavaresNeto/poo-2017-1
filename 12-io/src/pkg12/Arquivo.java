package pkg12;

import java.io.*;
import java.util.*;

public class Arquivo {

    public void salva(String caminho, String texto) {
                
        File arquivo = new File(caminho);        
        // try with resources (fecha automaticamente o resource após o try)
        try (PrintWriter out = new PrintWriter(arquivo)) {
            out.println(texto);            
            out.flush();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        
    }

    public String abre(String caminho) throws FileNotFoundException {
        String texto = "";
        
        File arquivo = new File(caminho);
        
        try (Scanner in = new Scanner(arquivo)) {
        
            while (in.hasNextLine()) {
                texto += in.nextLine() + "\n";
            }
            
        } // close automático
        
        return texto;
    }
    
    
    
    
    
    
    
    
    
}
