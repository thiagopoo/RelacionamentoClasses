package classes;

public class EditoraLivro {

    private String nome;
    private Endereco endereco;

    public EditoraLivro(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String imprimeEditora() {
        return "O editora é : " + nome + "E o endereco é: " + endereco.imprime();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
