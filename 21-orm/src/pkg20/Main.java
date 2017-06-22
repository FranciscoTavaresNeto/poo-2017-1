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
        /*
        FuncionarioDAO dao = new FuncionarioDAO();
        
        Funcionario i = dao.buscaCodigo(2);
        
        i.setSalario(1700.0);
        i.registrarPonto(LocalDateTime.of(2017, 6, 20, 21, 0),
                         LocalDateTime.of(2017, 6, 20, 22, 0));
        
        dao.salvar(i);
        */

        /*
        Departamento d1 = new Departamento();
        d1.setNome("Teste de dep");
        
        DepartamentoDAO depDAO = new DepartamentoDAO();
        depDAO.salvar(d1);
        
        System.out.println(d1.getCodigo());
        */
        
        /*
        Funcionario f2 = new Funcionario();
        f2.setNome("Quaresma");
        f2.setCpf("22299966633");
        
        Departamento d2 = new Departamento();
        d2.setNome("TI");       
        
        d2.alocar(f2);
        
        System.out.println(f2.getDepartamento());
        System.out.println(d2.getFuncionarios());
                
        FuncionarioDAO fdao = new FuncionarioDAO();
        
        fdao.salvar(f2);
                
        System.out.println(f2.getCodigo());
        System.out.println(d2.getCodigo());
        */
        
        /*
        FuncionarioDAO fdao = new FuncionarioDAO();
        DepartamentoDAO ddao = new DepartamentoDAO();
        
        Funcionario f3 = fdao.buscaCodigo(5); // Francisco
        Departamento d3 = ddao.buscaCodigo(1); // RH
        
        d3.alocar(f3);        
        fdao.salvar(f3);
        */
        
        FuncionarioDAO fdao = new FuncionarioDAO();
        
        Funcionario f4 = fdao.buscaCodigo(5); // Francisco
        System.out.println(f4.getDepartamento());
                
        System.out.println(f4.getDepartamento().getFuncionarios());
        
        fdao.carregaFuncionarios(f4.getDepartamento());
        
        System.out.println(f4.getDepartamento().getFuncionarios());
        
    }
    
}
