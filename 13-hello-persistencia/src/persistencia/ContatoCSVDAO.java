package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import negocio.Contato;

public class ContatoCSVDAO implements IContatoDAO {

    @Override
    public void salvar(Contato contato) {
        
        String linha = contato.getNome() + ";"
                + contato.getTelefone() + ";"
                + contato.getEmail();
        
        File arquivo = new File("dados.csv");
        
        try{
            if ( ! arquivo.exists()) arquivo.createNewFile();            
            PrintWriter writer = new PrintWriter(new FileWriter(arquivo, true));
            writer.append(linha + '\n');
            writer.flush();
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }

}
