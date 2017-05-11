package persistencia;

// API do DAO

import negocio.Contato;

// DAO abstrato e não um DAO concreto
public interface IContatoDAO {
    
    public void salvar(Contato contato);
    
}
