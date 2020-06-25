package classes;

public class Livro {

    private String nome;
    private EditoraLivro editora;
    private Autor autor;
    private int numeroPaginas;

    public Livro(String nome, EditoraLivro editora, Autor autor, int numeroPaginas) {
    }

    public Livro() {
    }

    public String imprime(){
        return "Nome do livro: " + nome + "--Sobre o autor--" + autor.imprime() + "--Sobre a editora--" + editora.imprimeEditora();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EditoraLivro getEditora() {
        return editora;
    }

    public void setEditora(EditoraLivro editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}