package pkg20;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        /*
        Funcionario f1 = new Funcionario();
        f1.setCpf("88233344153");
        f1.setDataNascimento(LocalDate.of(1993, 4, 5));
        f1.setGenero(Funcionario.Genero.Masculino);
        f1.setNome("James Gosling");
        f1.setSalario(10123.88);
        f1.registrarPonto(LocalDateTime.of(2017, 6, 20, 8, 0),
                          LocalDateTime.of(2017, 6, 20, 12, 0));
        f1.registrarPonto(LocalDateTime.of(2017, 6, 20, 14, 0),
                          LocalDateTime.of(2017, 6, 20, 18, 0));
                          */
        FuncionarioDAO dao = new FuncionarioDAO();
        
        Funcionario i = dao.buscaCodigo(2);
        
        i.setSalario(1700.0);
        i.registrarPonto(LocalDateTime.of(2017, 6, 20, 21, 0),
                         LocalDateTime.of(2017, 6, 20, 22, 0));
        
        dao.salvar(i);

        
        
        
        
        
    }
    
}
