package pkg20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public final class Funcionario extends Entidade { // não pode ser estendida
    
    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void desalocar() {
        if (departamento == null) return;
        
        this.departamento.getFuncionarios().remove(this);
        this.departamento = null;
    }
    
    private ArrayList<Ponto> 
            pontos = new ArrayList();
        
    public void registrarPonto(LocalDateTime entrada,
                               LocalDateTime saida) {
        pontos.add(new Ponto(entrada, saida));
    }

    public ArrayList<Ponto> getPontos() {
        return pontos;
    }
    
    
    
    public enum Genero {
        Masculino, Feminino
    }
    
    
    // Double em vez double
    private Double salario; // DOUBLE/NUMERIC
    
    private String nome; // VARCHAR
    
    private String cpf; // VARCHAR
    
    private LocalDate dataNascimento; // DATE
    
    private LocalDateTime ultimaAtualizacao; // DATETIME/TIMESTAMP
    
    private Genero genero; // Masculino, Feminino // BYTE/SMALLINT
    
    private byte[] foto; // BLOB (Binary Large OBject)

    

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", salario=" + salario + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", ultimaAtualizacao=" + ultimaAtualizacao + ", genero=" + genero + ", foto=" + foto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
    
}
