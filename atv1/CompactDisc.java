package atv1;

public class CompactDisc extends Produto{
    private String album;
    private String artista;
    private String gravadora;

    public CompactDisc(String album, String artista, String gravadora, int codigo, double preco, String descricao){
        super(codigo, preco, descricao);
        this.album = album;
        this.artista = artista;
        this.gravadora = gravadora;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
