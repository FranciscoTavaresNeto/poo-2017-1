package pkg20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public final class Funcionario { // não pode ser estendida
    
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
    
    // Integer em vez int (porque é anulável)
    private Integer codigo; // PK // INTEGER/INT
    // Double em vez double
    private Double salario; // DOUBLE/NUMERIC
    
    private String nome; // VARCHAR
    
    private String cpf; // VARCHAR
    
    private LocalDate dataNascimento; // DATE
    
    private LocalDateTime ultimaAtualizacao; // DATETIME/TIMESTAMP
    
    private Genero genero; // Masculino, Feminino // BYTE/SMALLINT
    
    private byte[] foto; // BLOB (Binary Large OBject)

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

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
    
}
