package classes;

public class CriarLivros{

    private static CriarLivros instance;

    private CriarLivros(){}

    public static CriarLivros getInstance(){
        if(instance == null){
            instance = new CriarLivros();
        }
        return instance;
    }

    Livro novoLivro = new Livro();

    public Livro criarLivros (String nome, Autor autor, EditoraLivro editora, int numeroPaginas){
        return new Livro( nome , editora, autor, numeroPaginas);
    }
}
