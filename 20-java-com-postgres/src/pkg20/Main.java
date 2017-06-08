package pkg20;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setCpf("88233344122");
        f1.setDataNascimento(LocalDate.of(1993, 4, 5));
        // f1.setFoto(foto);
        f1.setGenero(Funcionario.Genero.Masculino);
        f1.setNome("Francisco Tavares");
        f1.setSalario(10123.88);
        // f1.setUltimaAtualizacao(LocalDateTime.now());

        // f1.salva(); // ou usa um DAO:
        // Data Access Object (Objeto de Acesso a Dados)
        FuncionarioDAO dao = new FuncionarioDAO();
        
        System.out.println(f1);
        
        // dao.salvar(f1);
               
        System.out.println(f1);

        dao.excluir(1);
        
        Funcionario f2 = dao.buscaCodigo(1); // dao.findById // dao.findByCPF
        // null se não for encontrado
        System.out.println(f2);
        
        
        
        
    }
    
}
