package tela.usuario;
import java.util.ArrayList;
import  java.util.List;

//classe criada para a base de dados com o array, futuramente irei implementar um BD
public class LivroDatabase {
    private static final List<Livro> livros = new ArrayList<>();

    public static void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public static List<Livro> getLivros() {
        return livros;
    }

}
