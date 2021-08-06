package classes;

import javax.persistence.*;

@Entity // diz que a classe Aluno representa a tabela Aluno no banco de dados
public class Aluno {

    @Id // cada classe precisa ter um id único
    @GeneratedValue(strategy= GenerationType.IDENTITY) // gera os ids
    private int id;

    @Column(nullable = false) // mapeia as colunas
    private String nome;

    @Column(nullable = false)
    private int idade;

    // vários alunos que podem morar em vários estados
    @ManyToOne(fetch = FetchType.LAZY) // não vai carregar os alunos, apenas se der um get
    private Estado estado;

    public Aluno() { }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Estado estado) {
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", estado=" + estado +
                '}';
    }
}
