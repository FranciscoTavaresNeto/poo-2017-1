package pkg20;

import java.util.ArrayList;

public class Departamento extends Entidade {

    private String nome;
    
    private ArrayList<Funcionario> funcionarios =
            new ArrayList();

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void alocar(Funcionario f) {
        f.desalocar();
        this.funcionarios.add(f);
        f.setDepartamento(this);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Departamento{codigo=" + codigo + ", nome=" + nome + '}';
    }

}
