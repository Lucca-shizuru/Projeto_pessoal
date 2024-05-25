package tela.usuario;


public class Livro {
    private String  titulo;
    private String autor;
    private  String genero;
    private int avaliacao;

    public Livro( String titulo, String autor, String genero, int avaliacao){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.avaliacao = avaliacao;

    }
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
}
