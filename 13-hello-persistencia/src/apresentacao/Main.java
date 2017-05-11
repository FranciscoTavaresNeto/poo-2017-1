package apresentacao;

import persistencia.ContatoCSVDAO;
import negocio.Contato;
import persistencia.IContatoDAO;

public class Main {

    public static void main(String[] args) {
        
        IContatoDAO dao = new ContatoCSVDAO();
        // TODO:
        // IContatoDAO dao = new ContatoSQLDAO();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaContatoNovo(dao).setVisible(true);
            }
        });
        
    }    
}
