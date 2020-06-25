package classes;

public class Autor {

    private String nome;
    private Endereco endereco;
    private int qtdaLivrosPublicados;

    public Autor(String nome, Endereco endereco, int qtdaLivrosPublicados) {
        this.nome = nome;
        this.endereco = endereco;
        this.qtdaLivrosPublicados = qtdaLivrosPublicados;
    }

    public String imprime() {
        return "O autor é : " + nome + "E o endereco é: " + endereco.imprime();
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

    public int getQtdaLivrosPublicados() {
        return qtdaLivrosPublicados;
    }

    public void setQtdaLivrosPublicados(int qtdaLivrosPublicados) {
        this.qtdaLivrosPublicados = qtdaLivrosPublicados;
    }
}
