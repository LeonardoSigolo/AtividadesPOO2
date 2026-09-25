package atv1;

public class TesteProduto {
    static void main(String[] args){
    Livro livro = new Livro("Leonardo", "Palmeiras", "13489", 2007, 51, 1914, "Dale porco");
    CompactDisc disco = new CompactDisc("Pedrovisk", "Pedro Samegima", "Court", 1910, 2012, "Ruim");

        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Descrição: " + livro.getDescricao());
        System.out.println("Ano: " + livro.getAno());
        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Preco: " + livro.getPreco());
        System.out.println("============================================================");
        System.out.println("Album: " + disco.getAlbum());
        System.out.println("Artista: " + disco.getArtista());
        System.out.println("Gravadora: " + disco.getGravadora());
        System.out.println("Descrição: " + disco.getDescricao());
        System.out.println("Código: " + disco.getCodigo());
        System.out.println("Preço: " + disco.getPreco());
    }
}
