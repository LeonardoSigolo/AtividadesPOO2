package atv1;

public class Livro extends Produto{
    private String autor;
    private String editora;
    private String isbn;
    private int ano;

    public Livro(String autor, String editora, String isbn, int ano, int codigo, double preco, String descricao){
        super(codigo, preco, descricao);
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
